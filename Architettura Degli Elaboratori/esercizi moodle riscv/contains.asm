.globl _start
.section 
.data
    buffer: .string  "test strinG"
    low:    .byte  'A'
    high:   .byte  'Z'

.text
_start:
    # call contains
    la   a0, buffer
    la   a1, low
    la   a2, high
    lbu  a1, 0(a1)
    lbu  a2, 0(a2)
    jal  ra, contains

    # exit
    li   a7, 10
    ecall

#******************************************
# completare la funzione nel campo di sotto

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