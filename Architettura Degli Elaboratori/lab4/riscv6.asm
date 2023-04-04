.globl _start
.text
_start:
# CICLI FOR ANNIDATI
	li t0, 10	# a = 10
	li t1, 5	# b = 5
			# R = 0  -> t2
			# i = 0  -> t3
			# j = 0  -> t4
FORi:
	add t4, zero, zero
	bge t3, t0, end
FORj:	
	bge t4, t1, end1
	add t2, t2, t2
	add t5, t3 t4
	add t2, t2, t5
	
	addi t4, t4, 1	# j++
	beq zero, zero FORj
end1:
	addi t3, t3, 1	# i++
	beq zero, zero FORi
	

	
	
end:
	addi x17, x0, 10
	ecall