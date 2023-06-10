.globl _start
.data
    str: .string  "My string"
.text
_start:
    # call strlen
    la   a0, str
    jal  ra, strlen

    #exit
    li   a7, 10
    ecall

#****************************************************
# completare la funzione strlen nel campo di sotto
strlen:
	addi	sp, sp, -16
	sd	ra, 0(sp)
	sd	a1, 8(sp)

	li	t0, 0	# i = 0
loop:
	add	a1, a0, t0
	lbu	a1, 0(a1)
	beq	a1, zero, endloop
	addi	t0, t0, 1
	j 	loop
endloop:
	mv	a0, t0
	
	ld	ra, 0(sp)
	ld	a1, 8(sp)
	addi	sp, sp, 16
	ret