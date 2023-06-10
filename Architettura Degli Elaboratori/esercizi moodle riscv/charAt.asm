.globl _start
.data
    str: .string "Hello World!"
    n:   .word   6

.text
_start:
    # call charAt
    la  a0, str
    la  a1, n
    lw  a1, 0(a1)
    jal ra, charAt

    #exit
    li   a7, 10
    ecall

#******************************************
# a0 <- *str
# a1 <- n
charAt:
	add	a0, a0, a1	# calcolo offset
	lbu	a0, 0(a0)
	ret

