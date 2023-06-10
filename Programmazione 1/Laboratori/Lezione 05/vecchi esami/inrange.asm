.globl _start
.data
	nbr: .word -128
.text
_start:
	# call inrange
	la	a0, nbr
	jal	ra, inrange
	
	li   a7, 10
    	ecall

# dire se nbr è compreso tra -128 e 127 (interi rappresentabili in 1 byte)   	
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