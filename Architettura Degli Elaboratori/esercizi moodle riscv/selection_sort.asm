.globl _start
  .data
    size:  .word  10
    array: .word  3,1,6,6,23,17,9,25,3,4
  
  .text
  _start:
      # chiama selection_sort
      la   a0, array
      la   a1, size
      lw   a1, 0(a1)
      jal  ra, selection_sort
      
      #exit
      li   a7, 10
      ecall   

#****************************************************
swap:
	addi	sp, sp, -16
	sd	a0, 0(sp)
	
	li	t0, 4
	mul	a1, a1, t0
	mul	a2, a2, t0
	
	add	a0, a0, a1	# calcolo *array[x]
	sd	a0, 8(sp)	# salvo *array[x] in posizione 8 dello stack
	lw	a1, 0(a0)	# a1 <- array[x]
	ld	a0, 0(sp)	# recupero *array
	add	a0, a0, a2	# calcolo *array[y]
	lw	a2, 0(a0)	# a2 = array[y]
	sd	a0, 0(sp)	# salvo *array[y] in posizione 0 dello stack
	ld	a0, 8(sp)	# recupero *array[x]
	sw	a2, 0(a0)	# array[x] = a2 = array[y]
	ld	a0, 0(sp)	# recupero *array[y]
	sw	a1, 0(a0)	# array[y] = a1 = array[x]
	
	addi	sp, sp, 16
	ret

#****************************************************
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
	
#****************************************************
# a0 <- *array
# a1 <- size
selection_sort:
	li	t0, 1
	bgt	a1, t0, continua
	ret
continua:
	addi	sp, sp, -32
	sd	ra, 0(sp)
	sd	a0, 8(sp)
	sd	a1, 16(sp)
	
	jal	ra, minarray
	sd	a0, 24(sp)	# min_idx
	ld	a0, 8(sp)	# ripristino a0
	mv	a1, zero
	ld	a2, 24(sp)
	jal	ra, swap
	ld	a0, 8(sp)	# ripristino a0
	addi	a0, a0, 4
	ld	a1, 16(sp)
	addi	a1, a1, -1
	jal	ra, selection_sort
	
	ld	ra, 0(sp)
	ld	a0, 8(sp)
	ld	a1, 16(sp)
	addi	sp, sp, 32
	ret