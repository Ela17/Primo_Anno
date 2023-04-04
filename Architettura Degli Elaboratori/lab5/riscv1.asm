.globl _start
.data	# MEDIA INTERI
	v1: .word -8
	v2: .word -11
	v3: .word -2
	v4: .word -4
.text
_start:
	la t0, v1	# metto nel registro t0 l'indirizzo in memoria di v1
	lw t1, 0(t0)	# metto in t1 il valore contenuto all'indirizzo salvato in t0
	lw t2, 4(t0)	# metto in t2 il valore contenuto all'indirizzo salvato in t0 + 4
	add t1, t1, t2
	lw t2, 8(t0)	# metto in t2 il valore contenuto all'indirizzo salvato in t0 + 8
	add t1, t1, t2
	lw t2, 12(t0)	# metto in t2 il valore contenuto all'indirizzo salvato in t0 + 12
	add t1, t1, t2
	srai t1, t1, 2	# divisione per 4
	sw t1, 16(t0)	# salvo in memoria all'indirizzo t0 + 12 il valore contenuto nel registro t1
end:
	addi x17, x0, 10
	ecall
