.globl _start
.data
    str: .string "Hello World!"

.text
_start:
    # call hash
    la  a0, str
    jal ra, hash

    #exit
    li   a7, 10
    ecall

#******************************************
# a0 <- *str
hash:
	addi 	sp, sp, -8
      	sd    	ra, 0(sp)
      	
      	lbu	t0, 0(a0)	# str[i]
	li	t1, 5381
	
loop:
	beq	t0, zero, endloop	# if(str[i] == '\0') esci dal loop
	slli	t2, t1, 5	# t2 <- hash << 5
	add	t1, t2, t1	# t1 <- (hash << 5) + hash
	add	t1, t1, t0	# t1 <- ((hash << 5) + hash) + str[i];
	addi	a0, a0, 1	# i++
	lbu   	t0, 0(a0)
	j	loop
endloop:
	mv	a0, t1
	ld    	ra, 0(sp)
      	addi  	sp, sp, 8
	ret