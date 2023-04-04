.globl _start
.data	# MAX IN MEMORIA
	v1: .word 2
	v2: .word 3
	v3: .word 1
	v4: .word 0
.text
_start:
	la t0, v1	# metto nel registro t0 l'indirizzo in memoria di v1
	lw t1, 0(t0)	# metto in t1 il valore contenuto all'indirizzo salvato in t0
	lw t2, 4(t0)	# metto in t2 il valore contenuto all'indirizzo salvato in t0 + 4
	lw t3, 8(t0)
	bgt t1, t2, V1magg
	bgt t3, t2, V3magg
	sw t2, 12(t0)
	j end
V1magg:
	bgt t1, t3, endV1
V3magg:
	sw t3, 12(t0)
	j end
endV1:
	sw t1, 12(t0)	
end:
	addi x17, x0, 10
	ecall