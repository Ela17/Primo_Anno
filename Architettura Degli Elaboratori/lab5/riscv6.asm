.globl _start
.data	# NUMERO DI DISPARI
	array: 	.byte 2,1,3,2,3,-6,1,23 
	size: 	.word 8 		# X
	result: .word 0 		
.text
_start:
	la	t0, array
	lw 	t1, 8(t0)	# t1 = size = 8
LOOP:
	beq	t1, zero, END_LOOP
	lb	t2, 0(t0)	# t2 = v[i]
	andi	t3, t2, 1	# controllo se dispari
	beq	t3, zero, skip	# se pari allora non faccio nulla
	addi	t4, t4, 1	# cnt++
skip:
	addi	t0, t0, 1	# i++
	addi	t1, t1, -1	# size--
	beq	zero, zero, LOOP
END_LOOP:
	sw	t4, 4(t0)
end:
	addi 	x17, x0, 10
	ecall
