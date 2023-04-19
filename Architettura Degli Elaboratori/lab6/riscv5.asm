.globl _start
.data
	str:	.string "my long string"
	char: 	.string "g"
.text
_start:
	la	a0, str
	la	t1, char
	lbu 	a1, 0(t1)
	jal 	ra, strchr
end:
	addi	x17, x0, 10
	ecall

######################################
strchr:
	
loop:
	lbu	t1, 0(a0)
	beq	t1, a1, end_loop
	addi	a0, a0, 1
	bne	t1, a1, loop
	add	a0, zero, zero
end_loop:	
	ret