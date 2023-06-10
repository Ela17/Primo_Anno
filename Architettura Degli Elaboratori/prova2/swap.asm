.globl _start
.data
    size:  .word 8
    array: .word 1,5,3,7,2,6,4,8
    x:     .word 0
    y:     .word 1
    
.text
_start:
    # chiama swap
    la   a0, array
    la   a1, x
    lw   a1, 0(a1)
    la   a2, y
    lw   a2, 0(a2)
    jal  ra, swap
    
    #exit
    li   a7, 10
    ecall

#***************************************************
# completare la funzione swap nel campo di sotto
swap:
	addi	sp, sp, -16
	sd	a0, 0(sp)
	
	li	t0, 4
	mul	a1, a1, t0
	mul	a2, a2, t0
	
	add	a0, a0, a1	# calcolo *array[x]
	sd	a0, 8(sp)	# salvo *array[x] in posizione 8 dello stack
	lw	a1, 0(a0)	# a1 <- array[x]
	ld	a0, 0(sp)	# recupero *array
	add	a0, a0, a2	# calcolo *array[y]
	lw	a2, 0(a0)	# a2 = array[y]
	sd	a0, 0(sp)	# salvo *array[y] in posizione 0 dello stack
	ld	a0, 8(sp)	# recupero *array[x]
	sw	a2, 0(a0)	# array[x] = a2 = array[y]
	ld	a0, 0(sp)	# recupero *array[y]
	sw	a1, 0(a0)	# array[y] = a1 = array[x]
	
	addi	sp, sp, 16
	ret