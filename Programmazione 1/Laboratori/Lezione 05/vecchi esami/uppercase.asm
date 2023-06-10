.globl _start
.data
	src: .string "COMPUTER"
.text
_start:
	# call uppercase
	la	a0, src
	jal	ra, uppercase
	
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
	
	
uppercase:
	addi	sp, sp, -16
	sd	ra, 0(sp)
	sd	a1, 8(sp)
	
loop:
	lbu	a1, 0(a0)
	beq	a1, zero, endloop
	mv	a1, a0
	jal	ra, isupr
	beq	a0, zero, return
	mv	a0, a1
	addi	a0, a0, 1
	j	loop
endloop:
	li	a0, 1
return:
	ld	ra, 0(sp)
	ld	a1, 8(sp)
	addi	sp, sp, 16
	ret
	