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

    int *vetorBolha, *vetorSelecao;
    vetorBolha = (int*)malloc(sizeof(int) * tamanho);
    vetorSelecao = (int*)malloc(sizeof(int) * tamanho);
    popula(vetorBolha, tamanho);
    popula(vetorSelecao, tamanho);

    //bolha
    tempoInicio = clock();
    bolha(vetorBolha,tamanho);
    tempoFim = clock();
    cout << "Tempo para bolha: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;

    //selecao
    tempoInicio = clock();
    selecao(vetorSelecao,tamanho);
    tempoFim = clock();
    cout << "Tempo para seleção: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    //exibe(vetorSelecao, tamanho);

    // lista = popularLista(tamanho, lista);
    // tempoInicio = clock();
    // lista = selecaoLista(lista);
    // tempoFim = clock();
    // cout << "Tempo para ordenar lista: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;

    //exibirLista(lista);


   
    return 1;
}