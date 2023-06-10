.globl _start
.data
    array: .word  1,2,3,4,5,6,7,8,9,10
    size:  .word  10
    
.text
_start:
    # chiama sumarray
    la   a0, array
    la   a1, size
    lw   a1, 0(a1)
    jal  ra, sumarray
    
    #exit
    li   a7, 10
    ecall

#****************************************************
# completare la funzione sumarray nel campo di sotto
sumarray:
	li	t0, 0	# sum
	li	t1, 0	# i
loop:
	bge	t1, a1, endloop	# if(i >= size) esci dal loop
	lw	t2, 0(a0)	# t2 <- array[i]
	add	t0, t0, t2	# sum += array[i]
	addi	t1, t1, 1	# i++
	addi 	a0, a0, 4
	j loop
endloop:
	mv	a0, t0
	ret