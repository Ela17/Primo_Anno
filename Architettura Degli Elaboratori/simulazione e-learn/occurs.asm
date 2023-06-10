.globl _start
.data
    array: .word 4, 2, 2, 4, 4, 5, 4, 3, 3, 3
    len:   .word 10
.text
_start:
    # chiama occurs
    la   a0, array
    la   t0, len
    lw   a1, 0(t0)
    li   a2, 4
    jal  ra, occurs
    # exit
    li   a7, 10
    ecall
    
occurs:
	addi	sp, sp, -24
	sd	a0, 0(sp)
	sd	a1, 8(sp)
	sd	a2, 16(sp)
	
	li	t1, 0	# i
	li	t2, 0	# sum
for:
	bge	t1, a1, endfor
	lw	t0, 0(a0)
	bne	t0, a2, next
	addi	t2, t2, 1
next:
	addi	t1, t1, 1
	addi	a0, a0, 4
	j for
endfor:
	mv	a0, t2
	ld	a1, 8(sp)
	ld	a2, 16(sp)
	addi	sp, sp, 24
	ret