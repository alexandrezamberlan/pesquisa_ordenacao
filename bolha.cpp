#include <iostream>
#include <time.h>

#include "metodosOrdenacao.h"

using namespace std;

int main() {
    clock_t tempoInicio, tempoFim;
    long long int tamanho;
    Celula *lista = NULL;

    cout << "Tamanho do vetor ou lista: ";
    cin >> tamanho;

    int *vetor;
    vetor = (int*)malloc(sizeof(int) * tamanho);
    popula(vetor, tamanho);
    tempoInicio = clock();
    bolha(vetor,tamanho);
    tempoFim = clock();
    cout << "Tempo para ordenar vetor: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // exibe(vetor, tamanho);

    lista = popularLista(tamanho, lista);
    tempoInicio = clock();
    lista = bolhaLista(lista);
    tempoFim = clock();
    cout << "Tempo para ordenar lista: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;

    //exibirLista(lista);


   
    return 1;
}