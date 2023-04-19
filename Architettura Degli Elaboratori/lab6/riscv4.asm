.globl _start
.data
	str1: .string "first"
	str2: .string "second"
.text
_start:
	la	a0, str1
	la	a1, str2
	jal	ra, strcmp
end:
	addi 	x17, x0, 10
	ecall

################################
strcmp:
	
loop:
	lbu	t1, 0(a0)
	lbu	t2, 0(a1)
	bne 	t1, t2, esci
	beq	t1, zero, end_loop
	addi	a0, a0, 1
	addi 	a1, a1, 1
	j	loop
esci:
	addi	a0, zero, 1
	ret
end_loop:
	add 	a0, zero, zero
	ret