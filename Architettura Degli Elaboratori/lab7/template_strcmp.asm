# strcmp
.globl _start

.data
      str1: .string ""
      str2: .string ""

.text
_start:

      # call strcmp
      la   a0, str1
      la   a1, str2
      jal  ra, strcmp

      # result in a0
      li    a7, 1
      ecall
exit:
      #call number 10 = exit
      li    a7, 10
      ecall

################################################################################
# a0 = const char *str1
# a1 = const char *str2
################################################################################
strcmp:
# qui vi tocca scrivere
loop:
	lbu	t1, 0(a0)
	lbu	t2, 0(a1)
	bne 	t1, t2, esci
	beq	t1, zero, end_loop
	addi	a0, a0, 1
	addi 	a1, a1, 1
	j	loop
esci:
	addi	a0, zero, 1
	ret
end_loop:
	add 	a0, zero, zero
	ret  
      

################################################################################

