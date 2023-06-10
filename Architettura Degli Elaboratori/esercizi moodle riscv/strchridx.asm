.globl _start
.data
    str:  .string "my long string"
    c:    .byte 'g'
.text
_start:
    # call strchridx
    la   a0, str
    la   a1, c
    lb   a1, 0(a1)
    jal  ra, strchridx

    #exit
    li   a7, 10
    ecall

#****************************************************
# completare la funzione strchr nel campo di sotto
strchridx:
	addi	sp, sp, -32
	sd	ra, 0(sp)
	sd	a1, 8(sp)
	sd	s0, 16(sp)
	sd	s1, 24(sp)

	li	s1, 0	# i = 0
loop:
	add	s0, a0, s1
	lb	s0, 0(s0)
	beq	s0, zero, endloop
	beq	s0, a1, endloop
	addi	s1, s1, 1
	beq	zero, zero, loop
endloop:
	bne	s0, zero, else
	li	a0, -1
	beq	zero, zero, end
else:
	mv	a0, s1
end:	
	ld	ra, 0(sp)
	ld	a1, 8(sp)
	ld	s0, 16(sp)
	ld	s1, 24(sp)
	addi	sp, sp, 32
	ret