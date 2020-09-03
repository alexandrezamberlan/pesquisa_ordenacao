#include "utilidades.h"

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

void selecao(int *vetor, long long int n) {
    long long int posMenor, i, j;
    int tmp;

    for (i = 0; i < n-1; i++) {
        posMenor = i;
        for (j = i + 1; j < n; j++ ) {
            if (vetor[j] < vetor[posMenor]) {
                posMenor = j;
            }
        }
        if (i != posMenor) { 
            tmp = vetor[i];
            vetor[i] = vetor[posMenor];
            vetor[posMenor] = tmp;
        }
    }
}

Celula *selecaoLista(Celula *l) {
    Celula *posMenor, *i, *j;
    int tmp;

    if (!l) return l;

    for (i = l; i->prox; i = i->prox) {
        posMenor = i;
        for (j = i->prox; j ; j = j->prox) {
            if (j->dado < posMenor->dado) {
                posMenor = j;
            }
        }
        if (i != posMenor) { 
            tmp = i->dado;
            i->dado = posMenor->dado;
            posMenor->dado = tmp;
        }
    }
    return l;
}