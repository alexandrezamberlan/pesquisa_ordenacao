#include "lista.h"

void bolha(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i;

    do {
        houveTroca = false;
        for (i = 0; i < n-1; i++) {
            if (vetor[i] > vetor[i+1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = tmp;  
            }
        }
    } while (houveTroca);
}

Celula *bolhaLista(Celula *l) {
    Celula *i;
    int houveTroca;
    int tmp;

    if (!l) return l;

    do {
        houveTroca = 0;
        for (i = l; i->prox; i = i->prox){
            if (i->dado > i->prox->dado) {
                houveTroca = 1;
                tmp = i->dado;
                i->dado = i->prox->dado;
                i->prox->dado = tmp;
            }
        }
    } while (houveTroca);

    return l;
}