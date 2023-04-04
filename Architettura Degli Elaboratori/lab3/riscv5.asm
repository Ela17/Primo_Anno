.globl _start
.text

_start:
	li x5, 4
	li x6, 8
	add x7, x5, x6
	srli x7, x7, 1

exit:
	addi x17, x0, 10
	ecall