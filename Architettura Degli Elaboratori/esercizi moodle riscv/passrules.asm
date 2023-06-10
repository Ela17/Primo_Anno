.globl _start
.data
      buffer: .string  "BADPass4"
.text
_start:
    # call passrules
    la   a0, buffer
    jal  ra, passrules

    #exit
    li   a7, 10
    ecall

contains:
	addi	sp, sp, -40
	sd	ra, 0(sp)
	sd	a1, 8(sp)
	sd	a2, 16(sp)
	sd	s0, 32(sp)
	
	mv	s0, a0
loop:
	lbu	a0, 0(s0)
	beq	a0, zero, endloop
	blt	a0, a1, no
	bgt	a0, a2, no
	li	t0, 1
	beq	zero, zero, end
no:
	addi	s0, s0, 1
	beq	zero, zero, loop
endloop:
	li	t0, 0
end:
	mv	a0, t0
	ld	ra, 0(sp)
	ld	a1, 8(sp)
	ld	a2, 16(sp)
	ld	s0, 32(sp)
	addi	sp, sp, 40
	ret
	
#****************************************************
# completare la funzione passrules nel campo di sotto
passrules:
	addi	sp, sp, -24
	sd	ra, 0(sp)
	sd	a0, 8(sp)
	
	li	a1, 65
	li	a2, 90
	jal	ra, contains
	sd	a0, 16(sp)	# deposito il risultato di contains
	ld	a0, 8(sp)	# recupero *buffer
	li	a1, 48
	li	a2, 57
	jal	ra, contains
	ld	a1, 16(sp)	#	a1 <- risultato del primo contains
	
	and	a0, a0, a1
	
	ld	ra, 0(sp)
	addi	sp, sp, 24
	ret
	
