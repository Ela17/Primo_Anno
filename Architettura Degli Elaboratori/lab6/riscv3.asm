.globl _start
	# strlen
.data
	str: .string "This is the source string."
.text
_start:
	la	a0, str
	jal	ra, strlen
	# a0 = size
end:
	addi 	x17, x0, 10
	ecall

###################################
# a0 <- puntatore al primo carattere di str
# return in a0
strlen:
	add	t0, t0, zero	# contatore di caratteri letti
loop:
	add	t1, t0, a0	
	lbu	t1, 0(t1)	# prendo il char contenuto nella posizione calcolata
	beq	t1, zero, end_loop
	addi	t0, t0, 1	# incremento contatore
	j 	loop
end_loop:
	add	a0, t0, zero
	ret
	