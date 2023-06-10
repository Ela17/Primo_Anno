.globl _start
  .data
    size:  .word  3
    array: .word  2, 1, 0
  
  .text
  _start:
      # chiama minarray
      la   a0, array
      la   a1, size
      lw   a1, 0(a1)
      jal  ra, minarray
      
      #exit
      li   a7, 10
      ecall   

#****************************************************
# a0 <- *array
# a1 <- size
minarray:
	addi	sp, sp, -16
	sd	a0, 0(sp)
	sd	s1, 8(sp)
	
	li	t0, 1	# i = 1
	li	t1, 0	# min_idx
	lw	t2, 0(a0)	# min_val
	
	addi	a0, a0, 4
while:
	bge	t0, a1, endwhile
	lw	s1, 0(a0)	# s1 <- array[i]
	bge	s1, t2, next
	mv	t1, t0		# min_idx = i
	mv	t2, s1		# min_val = array[i]
next:
	addi	t0, t0, 1
	addi	a0, a0, 4
	j while
endwhile:
	mv	a0, t1
	ld	s1, 8(sp)
	addi	sp, sp, 16
	ret
	