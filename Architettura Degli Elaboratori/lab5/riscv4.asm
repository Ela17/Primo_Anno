.globl _start
.data	# SOMMA ARRAY
	size: 	.word 	8 # X
	array:	.word	4, 3, 8, -2, 7, 8, 12, 15	# vettore da sommare
	result: .word	0
.text
_start:
	la 	t0, size
	lw 	t1, 0(t0)
	lw	t2, 4(t0)
LOOP:
	beq	t1, zero, END_LOOP
	addi 	t0, t0, 4	# siamo all'inizio del vettore
	lw	t3, 4(t0)
	add	t2, t2, t3
	
	addi 	t1, t1, -1	# cnt --
	beq	zero, zero, LOOP
END_LOOP:
	sw	t2, 4(t0)
	
end:
	addi x17, x0, 10
	ecall
