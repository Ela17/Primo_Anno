# ########################################################################
# Scrivere una funzione RISC-V isnumber che controlla se una stringa ricevuta
# come parametro è la rappresentazione di un numero intero positivo in ASCII.
# Controllare vuol dire: restituire 1 se la condizione è vera, 0 altrimenti.
# 
# isnumber deve utilizzare la funzione isdigit realizzata nell'esercizio
# precedente.
# ########################################################################


.globl _start

.data
  in_str: .string "1w23" 

.text

_start:
  la a0, in_str

  jal isnumber
  
  li a7, 1 # stampo risultato {0,1}
  ecall

exit:
  li a7, 10
  ecall


# ######################################################################## int
# isnumber(char* in_str){
#   char* cursor = in_str;
#
#   if(!(*cursor)){return 0;}
#
#   while(*cursor){
#     if(!isdigit(*cursor)){
#       return 0;
#     }
#     ++cursor;
#   }
#   return 1;
# }
# 

isnumber:
  






# =================================
# int isdigit(char in_char) {
#   return (in_char >= 48 && in_char <= 57) ? 1 : 0;
# }
# =================================
# a0 --> in_char
# 

isdigit:
  

















