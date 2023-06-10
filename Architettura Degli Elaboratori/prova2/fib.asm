.globl _start
.data
    num: .dword 5
.text
_start:
    # call fib
    la    a0, num
    ld    a0, 0(a0)
    jal   ra, fib

    #exit
    li    a7, 10
    ecall

   
#*******************************************************************************   
fib:
	addi	sp, sp, -32
	sd	ra, 0(sp)
	sd	a0, 8(sp)	# n
	
	beq	a0, zero, ret_zero
	li	t0, 1
	beq	a0, t0, ret_uno
	addi	a0, a0, -1	# a0 = n-1
	jal	ra, fib
	sd	a0, 16(sp)	# salvo nello stack fib(n-1)
	ld	a0, 8(sp)	# a0 <- n
	addi	a0, a0, -2	# a0 = n-2
	jal	ra, fib
	ld	a1, 16(sp)	# a1 <- fib(n-1)
	add	a0, a0, a1
	j fine
	
ret_zero:	
	li	a0, 0
	j fine
ret_uno:
	li	a0, 1
fine:
	ld	ra, 0(sp)
	addi	sp, sp, 32
	ret