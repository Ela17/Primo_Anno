.globl _start
.text
_start:
# CONTA UNO
	li t0, 37	# valore da esaminare
	li t1, 1	
	li t2, 64	# numero bit da esaminare
loop:
	beq t2, zero, end
	and t3, t0, t1
	add t4, t4, t3		# t4 risultato
	
	srli t0, t0, 1
	sub t2, t2, t1
	
	beq zero, zero, loop
end:
	
exit:
	addi x17, x0, 10
	ecall