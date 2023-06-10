.globl _start
.data
    num1: .dword 24
    num2: .dword 30
.text
_start:
    # call MCD
    la    a0, num1
    la    a1, num2
    ld    a0, 0(a0)
    ld    a1, 0(a1)     
    jal   ra, mcd

    #exit
    li    a7, 10
    ecall

#****************************************************
# completare la funzione MCD nel campo di sotto
# a0 contiene il valore di num1
# a1 contiene il valore di num2
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
