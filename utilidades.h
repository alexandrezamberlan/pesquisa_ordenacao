#include <iostream>
#include <time.h>
using namespace std;

typedef struct nodo {
    int dado;
    struct nodo *prox;
} Celula;

void exibirLista(Celula *l) {
    if (!l) return;

    for (; l; l = l->prox) {
        cout << l->dado << endl;
    }

}

Celula *inserirDesordenadoLista(int valor, Celula *l) {
    Celula *novo = (Celula *)malloc(sizeof(Celula));

    novo->dado = valor;
    novo->prox = l;

    if (!l) return novo;

    return novo;
}

Celula *popularLista(long long int qtd, Celula *l) {
    srand(time(NULL));
    do {
        l = inserirDesordenadoLista(rand() % 100, l);
        qtd--;
    } while (qtd > 0);
    return l;
}


void popula(int *vetor, long long int n) {
    srand(time(NULL));
    for (long long int i = 0; i < n; i++) {
        vetor[i] = rand() % 100;
    }
}

void exibe(int *vetor, long long int n) {
    for (long long int i = 0; i < n; i++) {
        cout << (i+1) << "o valor: " << vetor[i] << endl;
    }
}
