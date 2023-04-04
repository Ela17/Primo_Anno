.globl _start
.data	# MAX ARRAY
	size: 	.word 16	# X
	array1: .word -12, 2, 1, 3, 5, 1, 7, 1, -1, 4, -2, -3, 1, 9, -6, -10
	ris:	.word 0	
.text
_start:
	la 	t0, size
	lw 	t1, 0(t0)	# t1 = X
	lw	t2, 4(t0)	# t2 = v[0]
LOOP:
	beq	t1, zero, END_LOOP
	addi 	t0, t0, 4	# vado all'indirizzo successivo
	lw	t3, 4(t0)
	bgt	t2, t3, jump	# se v[i-1] > v[i]
	add 	t2, t3, zero
jump:
	addi 	t1, t1, -1	# X --
	beq	zero, zero, LOOP
END_LOOP:
	sw	t2, 4(t0)
end:
	addi x17, x0, 10
	ecall
