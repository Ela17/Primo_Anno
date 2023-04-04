#include <stdio.h>

public static int main (){
    int v[10] = {-12, 2, 1, 3, 5, 1, 7, 1, -1, 4};
    int size = 10;
    int i = 0, ris = 0;
    while (i < size){
        ris += v[i];
        i++;
    }
    printf("somma = %d", ris);
    return 0;
}