.globl _start
	# MCM(a,b)
.data
	
.text
_start:
	li	a0, 12	# a
	li	a1, 9	# b
	jal 	ra, mcm
	mv	t0, a0	
end:
	addi	x17, x0, 10
	ecall
##############################
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
###############################	
# a0 -> a
# a1 -> b
# return MCM su a0
mcm:
	addi	sp, sp, -16
	sd 	ra, 0(sp)
	sd	s1, 8(sp)
	mul	s1, a0, a1
	jal	ra, mcd
	div	a0, s1, a0
	# ripristino sp
	ld 	ra, 0(sp)
	ld	s1, 8(sp)
	addi	sp, sp, -16
	ret