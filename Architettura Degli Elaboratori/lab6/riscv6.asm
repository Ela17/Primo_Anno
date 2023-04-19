.globl _start
.data
	str:	.string "my long string"
	char: 	.string "g"
.text
_start:
	la	a0, str
	la	t1, char
	lbu	a1, 0(t1)
	jal	ra, strrchr
end:
	addi	x17, x0, 10
	ecall

################################
strrchr:
	add	t2, zero, zero
loop:
	lbu	t1, 0(a0)
	beq	t1, zero, end_loop
	bne	t1, a1, next
	add	t2, zero, a0

next:
	addi	a0, a0, 1
	j 	loop
end_loop:
	add	a0, t2, zero
	ret