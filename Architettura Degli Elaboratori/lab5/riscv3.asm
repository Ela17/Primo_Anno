.globl _start
.data
	MemVett: .dword -12, 2, 1, 3, 5, 1, 7, 1, -1, 4
#	<<completare questa parte>>
.text
_start:
	la	t2, MemVett
	addi 	t1, t1, 0		# Ris = 0
	addi 	t1, t1, 0		# i = 0
	addi 	t3, zero, 10		# t3 = 10
CICLO: 
	ld 	t4, 0(t2)		# t4 = vett[0]
	add 	t0, t0, t4		# Ris = Ris + vett[0]
	addi 	t2, t2, 8		# t2 = prossimo indice (salta di 8 perchè double word)
	addi 	t1, t1, 1		# i++
	blt 	t1, t3, CICLO		# if i < 10 ripeti ciclo
	# SOMMA GLI ELEMENTI DEL VETTORE E SALVA IN t0 ( = Ris )
	# expected t0 <-- 11
end:
	addi 	x17, x0, 10
	ecall