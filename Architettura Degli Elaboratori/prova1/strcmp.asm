.globl _start
.data
    str1: .string  "first."
    str2: .string  "second."
.text
_start:
    # call strcmp
    la   a0, str1
    la   a1, str2
    jal  ra, strcmp

    #exit
    li   a7, 10
    ecall

#****************************************************
# completare la funzione strcmp nel campo di sotto
strcmp:
	addi	sp, sp, -32
	sd	ra, 0(sp)
	sd	a1, 8(sp)
	sd 	s1, 16(sp)
	sd	s2, 24(sp)
	
loop:
	lbu	s1, 0(a0)
	lbu	s2, 0(a1)
	bne	s1, s2, false
	beq	s1, zero, endstr
	addi	a0, a0, 1
	addi	a1, a1, 1
	j	loop
false:
	li	a0, 1
	j 	end
endstr:
	li	a0, 0
end:	
	ld	ra, 0(sp)
	ld	a1, 8(sp)
	ld	s1, 16(sp)
	ld	s2, 24(sp)
	addi	sp, sp, 32
	ret