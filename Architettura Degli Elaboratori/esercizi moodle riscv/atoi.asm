.globl _start
.data
    numstr: .string  "12"
.text
_start:
    # chiama strlen per ottenere la lunghezza della stringa
    la   a0, numstr
    jal  ra, strlen
    
    # chiama atoi
    mv   a1, a0
    la   a0, numstr
    jal  ra, atoi

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

#****************************************************
# atoi(str, n)
# a0 - str
# a1 - n
atoi:
	bne	a1, zero, ricorsione
	li	a0, 0
	ret
	
ricorsione:
	addi	sp, sp, -16
	sd	ra, 0(sp)
	sd	s1, 8(sp)	

	addi	a1, a1, -1	# a1 <- n-1
	add	t0, a0, a1	# t0 <- *str[n-1]
	lbu  	s1, 0(t0)	# s1 <- str[n-1]
	addi 	s1, s1, -48	# s1 = str[n-1] - '0'    ( '0' = 48 )
	jal	ra, atoi
	
	li	t0, 10
	mul	t0, t0, a0	# t0 <- 10 * atoi(str, n-1)
	add	a0, s1, t0	# a0 <- 10 * atoi(str, n-1) + str[n-1] - '0' 
	
	ld 	ra, 0(sp)
	ld   	s1, 8(sp)
	addi 	sp, sp, 16
	ret