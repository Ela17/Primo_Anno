.globl _start
.text
_start:
# MAX 
	addi t0, zero, 41
	addi t1, zero, 47
	addi t2, zero, 45
	
	bgt t1, t0, max1
	bgt t2, t0, max2
	add t3, t0, zero
	beq zero, zero, exit	
max1:
	bgt t2, t1, max2
	add t3, t1, zero
	beq zero, zero, exit	
max2:
	add t3, t2, zero
	
exit:
	addi x17, x0, 10
	ecall
