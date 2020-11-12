#include <iostream>

using namespace std; 

long long int pesquisaSequencialRetornaPrimeiraOcorrencia(int numero, int *vetor, long long int n) {
    long long int i;
    
    for (i = 0; i < n; i++) {
        if (numero == vetor[i]) {
            return i;
        }
    }
    return -1;
}

void pesquisaSequencialMostraTodasAsPosicoes(int numero, int *vetor, long long int n) {
    long long int i;
    bool achou = false;
    for (i = 0; i < n; i++) {
        if (numero == vetor[i]) {
            printf("%lld\t", i);
            achou = true;
        }
    }
    if (!achou) {
        printf(" não localizado");
    }
    printf("\n\n");
}

Celula *pesquisaSequencialRetornaTodasAsOcorrencias(int numero, int *vetor, long long int n) {
    long long int i;

    Celula *lista = NULL;
    
    for (i = 0; i < n; i++) {
        if (numero == vetor[i]) {
            lista = inserirDesordenadoLista(i, lista);
            
        }
    }
    return lista;
}