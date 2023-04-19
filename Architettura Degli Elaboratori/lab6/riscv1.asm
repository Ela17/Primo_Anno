.globl _start
	# MCD(a,b)
.data
	
.text
_start:
	li	a0, 24	# a
	li	a1, 30	# b
	jal	ra, mcd
	mv	t0, a0	# result t0
end:
	addi	x17, x0, 10
	ecall


# a0 -> a
# a1 -> b
# return MCD su a0
mcd:
while:
	beq 	a0, a1, end_while
	bgt 	a1, a0, else
	sub	a0, a0, a1
	j	while
else:
	sub	a1, a1, a0
	j	while
end_while:
	ret