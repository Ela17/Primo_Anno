.globl _start
.data
    num: .dword 10        
.text
_start:
    # call serief
    la    a0, num
    jal   ra, serief

    #exit
    li    a7, 10
    ecall

#****************************************************
serief:
	li	t0, 3
	bgt	a0, t0, ricorsione
	li	a0, 1
	ret
	
	addi	sp, sp, -24
	sd	ra, 0(sp)
	sd	s2, 8(sp)	
	sd	s1, 16(sp)	
	
	addi	s2, a0, 0	# s2 <- x
	addi	a0, s2, -1	# a0 <- x-1
	jal	ra, serief	# a0 <- f(x-1)
	mv	s1, a0		# s1 <- f(x-1)
	
	addi	a0, s2, -2	# a0 <- x-2
	jal	ra, serief	# a0 <- f(x-2)
	add	a0, s1, a0	# a0 <- f(x-1) + f(x-2)
	
	addi	a0, s2, -3	# a0 <- x-3
	jal	ra, serief	# a0 <- f(x-3)
	add	a0, s1, a0	# a0 <- f(x-1) + f(x-2) + f(x-3)
	
	ld	ra, 0(sp)
	ld	s2, 8(sp)	
	ld	s1, 16(sp)
	addi	sp, sp, 24
	ret
	