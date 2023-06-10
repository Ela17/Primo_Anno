.globl _start
.data
	array:	.word 127, 6, 12, -3, -128
	size:	.word 5
.text
_start:
	# call bytearray
	la	a0, array
	la	t0, size
	lw	a1, 0(t0)
	jal	ra, bytearray
	
	li   a7, 10
    	ecall

# dice se una word è compresa tra -128 e 127 (interi rappresentabili in 1 byte)   	
inrange:
	lw	t0, 0(a0)
	li	t1, -128
	blt	t0, t1, notinrange
	li	t1, 127
	bgt	t0, t1, notinrange
	li	a0, 1
	ret
notinrange:
	li	a0, 0
	ret
	
# dice se l'array rispetta inrange
#	a0 <- *array
#	a1 <- size
bytearray:
	addi	sp, sp, -32
	sd	ra, 0(sp)
	sd	a1, 8(sp)
	sd	s0, 16(sp)
	sd	s1, 24(sp)
	
	li	s0, 0	# contatore celle lette
loop:	
	beq 	s0, a1, endloop
	mv	s1, a0
	jal	ra, inrange
	beq	a0, zero, end
	mv	a0, s1
	addi	a0, a0, 4
	addi	s0, s0, 1
	j	loop
	
endloop:
	li	a0, 1
	
end:
	ld	ra, 0(sp)
	ld	a1, 8(sp)
	ld	s0, 16(sp)
	ld	s1, 24(sp)
	addi	sp, sp, 32
	ret