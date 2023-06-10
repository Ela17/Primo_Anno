.globl _start
.data
    d: .byte '1'
.text
_start:
    # call digit
    la   a0, d
    lbu  a0, 0(a0)
    jal  ra, digit

    #exit
    li   a7, 10
    ecall

#****************************************************
# completare la funzione digit nel campo di sotto
digit:
	addi	sp, sp, -24
	sd	ra, 0(sp)
	sd	s1, 8(sp)
	sd	s2, 16(sp)
	
	li	s1, '0'
	li	s2, '9'
	
	blt	a0, s1, nodigit
	bgt	a0, s2, nodigit
	li	a0, 1
	j	enddigit
nodigit:
	li	a0, 0
	j 	enddigit	
	
enddigit:
	ld	ra, 0(sp)
	ld	s1, 8(sp)
	ld	s2, 16(sp)
	addi	sp, sp, 24
	ret