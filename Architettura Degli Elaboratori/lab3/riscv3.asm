.globl _start
.text

_start:
	li x5, 0x00000000AAAAAAAA
	li x6, 0x1234567812345678
	slli x7, x5, 4
	or x7, x7, x6
	
	slli x7, x6, 4
	
	srli x7,x5,3
	andi x7, x7, 0xFF

exit:
	addi x17, x0, 10
	ecall