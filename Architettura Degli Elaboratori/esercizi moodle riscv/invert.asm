.globl _start
.data
	size:  .word 8
        array: .word 1,5,3,7,2,6,4,8
.text
_start:
        # chiama invert
        la   a0, array
        la   a1, size
        lw   a1, 0(a1)        
        jal  ra, invert
        
        #exit
        li   a7, 10
        ecall
    
#***************************************************
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

#***************************************************
# completare la funzione invert nel campo di sotto
invert:
	addi	sp, sp, -32
	sd	ra, 0(sp)
	sd	a0, 8(sp)
	sd	s1, 16(sp)
	sd	s2, 24(sp)
	
	li	s1, 0	# i
	addi	s2, a1, -1	# s3 <- size - 1
for:
	bge	s1, s2, endfor	# condizione for	
	ld	a0, 8(sp)
	mv	a1, s1	# a1 <- i
	mv	a2, s2	# a2 <- size - 1 (nella prima iteraz i = 0)
	jal	ra, swap	# swap(array, i, size-i-1)
	addi	s1, s1, 1	# i++
	addi	s2, s2, -1	# size - i - 1
	j 	for
endfor:
	ld	ra, 0(sp)
	ld	s1, 16(sp)
	ld	s2, 24(sp)
	addi	sp, sp, 32
	ret