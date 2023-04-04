.globl _start
.text
_start:
# QUADRATI PERFETTI
	addi t1, zero, 10	# N = 10
	# S = 0  uso t0 (non è necessario inizializzare
	addi t2, zero, 1	# i = 1
loop:
	bgt t2, t1, end
	mul t3, t2, t2		# t3 = i*i
	add t0, t0, t3
	addi t2, t2, 1		# ++i
	ble t2, t1, loop
end:
	
exit:
	addi x17, x0, 10
	ecall