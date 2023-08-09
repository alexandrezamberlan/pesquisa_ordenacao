#include <iostream>
#include "biblioteca.h"
#define TAM 10

int main() {
    int vetor[TAM];
    
    popular(vetor, TAM);
    exibir(vetor, TAM);
    
    return 1;
}