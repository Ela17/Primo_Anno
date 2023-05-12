# Scrivere una funzione RISC-V digit che verifichi se un byte passato come
# parametro nel registro a0 rappresenta un carattere cifra (0-9) nella codifica
# ASCII. Verificare vuol dire: restituire 1 se la condizione è vera, 0
# altrimenti. 

.globl _start

.data
  byte: .byte '9'

.text

_start:
  la t0, byte
  lb a0, 0(t0)           # in a0 c'è un BYTE!

  li a1, 48
  li a2, 57
  
  jal isdigit
  
  li a7, 1 # stampo risultato {0,1}
  ecall

exit:
  li a7, 10
  ecall


# =================================
# int isdigit(char in_char) {
#   return (in_char >= 48 && in_char <= 57) ? 1 : 0;
# }
# =================================
# a0 --> in_char
# 

isdigit:
  
  






	ret













