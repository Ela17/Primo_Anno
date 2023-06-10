.globl _start
.data
	ch: .string "A"
.text
_start:
	# call isupr
	la	a0, ch
	jal	ra, isupr
	
	li   a7, 10
    	ecall
	
isupr:
	lbu	t0, 0(a0)
	li	t1, 'A'
	blt	t0, t1, no_upr
	li	t1, 'Z'
	bgt	t0, t1, no_upr
	li	a0, 1
	ret
no_upr:
	li	a0, 0
	ret
