#include <iostream>
#include <time.h>

#include "metodosOrdenacao.h"
#include "utilidades.h"

using namespace std;

int main() {
    clock_t tempoInicio, tempoFim;
    long long int tamanho;

    system("clear");//no windows é system("cls");

    cout << "Tamanho do vetor: ";
    cin >> tamanho;
    int *vetorBolha;
    int *vetorSelecao;
    int *vetorPente;
    vetorBolha = (int*)malloc(sizeof(int) * tamanho);
    vetorSelecao = (int*)malloc(sizeof(int) * tamanho);
    vetorPente = (int*)malloc(sizeof(int) * tamanho);
    popular(vetorBolha, tamanho);
    copiar(vetorBolha, tamanho, vetorSelecao);
    copiar(vetorBolha, tamanho, vetorPente);
    //exibir(vetorSelecao, tamanho);

    //pente
    tempoInicio = clock();
    pente(vetorPente,tamanho);
    tempoFim = clock();
    cout << "Tempo para pente: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    //exibir(vetorPente, tamanho);

    // //bolha
    // tempoInicio = clock();
    // bolha(vetorBolha,tamanho);
    // tempoFim = clock();
    // cout << "Tempo para bolha: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // // exibir(vetorBolha, tamanho);

    // //selecao
    // tempoInicio = clock();
    // selecao(vetorSelecao,tamanho);
    // tempoFim = clock();
    // cout << "Tempo para selecao: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // //exibir(vetorSelecao, tamanho);

  

    return 1;
}