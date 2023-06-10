.globl _start
.data
    num1: .dword 5
    num2: .dword 6
.text
_start:
    # call MCD
    la    a0, num1
    la    a1, num2
    ld    a0, 0(a0)
    ld    a1, 0(a1)     
    jal   ra, mcm

    #exit
    li    a7, 10
    ecall


mcd:
	addi	sp, sp, -16
	sd	ra, 0(sp)
	sd	a1, 8(sp)
	
loop:
	beq	a0, a1, endloop
	blt	a0, a1, else
	sub	a0, a0, a1
	beq	zero, zero, loop
else:
	sub	a1, a1, a0
	beq	zero, zero, loop
endloop:
	ld	ra, 0(sp)
	ld	a1, 8(sp)
	addi	sp, sp, 16
	ret

#****************************************************
# completare la funzione MCM nel campo di sotto
mcm:
	addi	sp, sp, -24
	sd	ra, 0(sp)
	sd	a0, 8(sp)
	sd	a1, 16(sp)
	
	mul	t0, a0, a1
	ld	a0, 8(sp)
	ld	a1, 16(sp)
	sd	t0, 16(sp)
	jal	ra, mcd
	ld	a1, 16(sp)
	div	a0, a1, a0
	
	ld	ra, 0(sp)
	ld	a1, 16(sp)
	addi	sp, sp, 24
	ret
