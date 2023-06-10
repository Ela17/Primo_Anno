.globl _start
.data
  size:  .word  10
  array: .word  1,3,5,6,7,8,9,25,30,40

.text
_start:
    # chiama issorted
    la   a0, array
    la   a1, size
    lw   a1, 0(a1)
    jal  ra, issorted
    
    #exit
    li   a7, 10
    ecall   

#****************************************************
# a0 <- *array
# a1 <- size
issorted:
	li	t0, 0	# i
	addi	a1, a1, -1	# size-1
for:
	bge	t0, a1, endfor
	
	lw	t1, 0(a0)	# t1 <- array[i]
	addi	t2, a0, 4
	lw	t2, 0(t2)	# t2 <- array[i+1]
	bgt	t1, t2, returnzero
	addi	t0, t0, 1	# i++
	addi	a0, a0, 4
	j 	for
returnzero:
	li	a0, 0
	ret	
endfor:
	li	a0, 1
	ret
	