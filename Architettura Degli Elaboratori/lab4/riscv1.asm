.globl _start
.text
_start:
#frammento 1
	li t0, 3
	li t1, 2
	sub t0, t0, t1
	bge t0, zero, ENDIF
	sub t0, t0, t0
ENDIF:	addi t1, t1, -1

# frammento 2
	li t0, 3
	li t1, 2
	addi t0, t0, -2
	add t0, t0, t1
	bge t0, t1, else
	addi t0, t0, 1
	beq zero, zero, end
else:
	addi t1, t1, 1
end:
exit:
	addi x17, x0, 10
	ecall