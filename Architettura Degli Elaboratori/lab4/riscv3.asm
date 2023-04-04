.globl _start
.text
_start:
# FIBONACCI
	addi t0, zero, 8	# N
	addi t1, zero, 1	# R
	addi t3, zero, 1	# B (A = 0 quindi non lo inizializzo ma uso t2)
loop:
	ble t0, zero, end
	add t1, t2, t3		# R = A + B
	add t2, t1, zero	# A = B
	add t3, t1, zero	# B = R
	addi t0, t0, -1		# N = N - 1
	bgt t0, zero, loop
	
end:

exit:
	addi x17, x0, 10
	ecall