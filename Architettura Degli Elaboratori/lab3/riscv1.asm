.globl _start
.text

_start:
	addi x5, x0, 41
	addi x6, x0, 43
	addi x7, x0, 47
	add x28, x5, x6
	add x28, x28, x7
	
exit:
	addi x17, x0, 10
	ecall