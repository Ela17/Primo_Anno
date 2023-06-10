.globl _start
.data
    numstr: .string  "1234"
.text
_start:
    # call isnumber
    la   a0, numstr
    jal  ra, isnumber

    #exit
    li   a7, 10
    ecall


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
	
#****************************************************
# completare la funzione isnumber nel campo di sotto
isnumber:
	addi	sp, sp, -16
	sd	ra, 0(sp)
	sd	s1, 8(sp)
	
	mv	s1, a0
loop:
	lbu	a0, 0(s1)
	beq	a0, zero, endloop
	jal	ra, digit
	beq	a0, zero, endisnum
	addi	s1, s1, 1
	j	loop

endloop:
	li	a0, 1
endisnum:
	ld	ra, 0(sp)
	ld	s1, 8(sp)
	addi	sp, sp, 16
	ret
	
	
