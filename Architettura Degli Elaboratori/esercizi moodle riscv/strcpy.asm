.globl _start
.data
    srcstr: .string  "string to be copied"
    dststr: .string  "destination string is long enough"
.text
_start:
    
    # chiama strcpy    
    la   a0, srcstr
    la   a1, dststr
    jal  ra, strcpy

    #exit
    li   a7, 10
    ecall

#*******************************************************************************
# strlen
# a0 - str
#*******************************************************************************
strlen:
        add  t0, zero, zero
strlen_loop:
        add  t1, t0, a0    
        lbu  t1, 0(t1)     
        beq  t1, zero, strlen_end
        addi t0, t0, 1 
        j    strlen_loop
strlen_end:
        addi a0, t0, 0
        ret    

#*******************************************************************************
strcpy:
	addi	sp, sp, -32
	sd	ra, 0(sp)
	sd	a0, 8(sp)	# *srcstr
	sd	a1, 16(sp)	# *dststr
	
	# chiamo strlen
	jal	ra, strlen	# calcolo n
	sd	a0, 24(sp)	# salvo n nello stack
	ld	a0, 16(sp)	# a0 <- *dststr
	# chiamo strlen
	jal	ra, strlen	# calcolo m
	ld	t1, 24(sp)	# t1 <- n
	sd	a0, 24(sp)	# salvo m nello stack
	
	ld	a0, 8(sp)	# a0 <- *srcstr
	ld	a1, 16(sp)	# a1 <- *dststr
	li	t0, 0		# i
for1:	
	beq	t0, t1, endfor1	# if(i == n) esci dal for
	lbu	t2, 0(a0)	# t2 <- src[i]
	sb	t2, 0(a1)	# dst[i] = src[i]
	addi	t0, t0, 1	# i++
	addi	a1, a1, 1	
	addi	a0, a0, 1
	j for1
endfor1:
	ld	t1, 24(sp)	# t1 <- m
for2:
	beq	t0, t1, endfor2	# if(i == m) esci dal for
	sb	zero, 0(a1)	# dst[i] = '\0'
	addi	t0, t0, 1	# i++
	addi	a1, a1, 1	
	j for2

endfor2:
	ld	ra, 0(sp)
	addi	sp, sp, 32
	ret	