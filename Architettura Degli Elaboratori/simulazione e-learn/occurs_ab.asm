.globl _start
.data
    array: .word 4, 2, 2, 4, 4, 5, 4, 3, 3, 3
    len:   .word 10
.text
_start:
    # chiama occurs_ab
    la   a0, array
    la   t0, len
    lw   a1, 0(t0)
    li   a2, 3
    li   a3, 4
    jal  ra, occurs_ab
    #exit
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
	
	
occurs_ab:
	addi	sp, sp, -40
	sd	a0, 0(sp)	# *array
	sd	a1, 8(sp)	# len
	sd	a2, 16(sp)	# numa
	sd	a3, 24(sp)	# numb
	sd	ra, 32(sp)
	
	jal	ra, occurs	# a0 <- oa
	ld	a2, 24(sp)	# a2 <- numb
	sd	a0, 24(sp)	# salvo oa nello stack
	ld	a0, 0(sp)	# recupero *array dallo stack
	ld	a1, 8(sp)	# a1 <- len
	jal	ra, occurs	# a0 <- ob
	ld	t0, 24(sp)	# t0 <- oa
	add	a0, a0, t0	# a0 <- oa + ob
		
	ld	ra, 32(sp)
	addi	sp, sp, 40
	ret