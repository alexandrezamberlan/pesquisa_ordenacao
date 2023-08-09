#include <iostream>
#include <time.h>

#include "metodosOrdenacao.h"

using namespace std;

int main() {
    clock_t tempoInicio, tempoFim;
    long long int tamanho;

    system("clear");//no windows é system("cls");

    cout << "Tamanho do vetor ou lista: ";
    cin >> tamanho;

    CelulaD *lista = NULL;
    int *vetorBolha, *vetorSelecao, *vetorInsercao, *vetorAgitacao, *vetorPente, *vetorShell, 
        *vetorQuick, *vetorMerge, *vetorHeap;
    // vetorBolha = (int*)malloc(sizeof(int) * tamanho);
    // vetorSelecao = (int*)malloc(sizeof(int) * tamanho);
    // vetorInsercao = (int*)malloc(sizeof(int) * tamanho);
    // vetorAgitacao = (int*)malloc(sizeof(int) * tamanho);
    vetorPente = (int*)malloc(sizeof(int) * tamanho);
    vetorShell = (int*)malloc(sizeof(int) * tamanho);
    vetorQuick = (int*)malloc(sizeof(int) * tamanho);
    vetorMerge = (int*)malloc(sizeof(int) * tamanho);
    vetorHeap = (int*)malloc(sizeof(int) * (tamanho+1));
    // popula(vetorBolha, tamanho);
    // popula(vetorSelecao, tamanho);
    // popula(vetorInsercao, tamanho);
    // popula(vetorAgitacao, tamanho);
    popula(vetorPente, tamanho);
    popula(vetorShell, tamanho);
    popula(vetorQuick, tamanho);
    popula(vetorMerge, tamanho);
    popula(vetorHeap, tamanho);
    vetorHeap[tamanho+1] = vetorHeap[0];
    vetorHeap[0] = -99;

    
    // //bolha
    // tempoInicio = clock();
    // bolha(vetorBolha,tamanho);
    // tempoFim = clock();
    // cout << "Tempo para bolha: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;

    // //selecao
    // tempoInicio = clock();
    // selecao(vetorSelecao,tamanho);
    // tempoFim = clock();
    // cout << "Tempo para seleção: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // // //exibe(vetorSelecao, tamanho);

    // //insercao
    // tempoInicio = clock();
    // insercao(vetorInsercao,tamanho);
    // tempoFim = clock();
    // cout << "Tempo para inserção: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    //exibe(vetorInsercao, tamanho);

    //agitacao
    // tempoInicio = clock();
    // agitacao(vetorAgitacao,tamanho);
    // tempoFim = clock();
    // cout << "Tempo para agitação: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // //exibe(vetorAgitacao, tamanho);

    tempoInicio = clock();
    pente(vetorPente,tamanho);
    tempoFim = clock();
    cout << "Tempo para pente: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // exibe(vetorPente, tamanho);

    // tempoInicio = clock();
    // shell(vetorShell,tamanho);
    // tempoFim = clock();
    // cout << "Tempo para shell: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // //exibe(vetorShell, tamanho);

    // tempoInicio = clock();
    // quickSort(vetorQuick, 0, tamanho-1);
    // tempoFim = clock();
    // cout << "Tempo para quick: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // // exibe(vetorQuick, tamanho);

    tempoInicio = clock();
    mergeSort(vetorMerge, tamanho);
    tempoFim = clock();
    cout << "Tempo para merge: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    //exibe(vetorMerge, tamanho);

    tempoInicio = clock();
    heapSort(vetorHeap, tamanho+1);
    tempoFim = clock();
    cout << "Tempo para heap: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // exibe(vetorHeap, tamanho);
    // printf("%d\n", vetorHeap[tamanho+1]);
    
    // lista = popularListaD(tamanho, lista);
    // tempoInicio = clock();
    // lista = agitacaoLista(lista);
    // tempoFim = clock();
    // cout << "Tempo para ordenar lista: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;

    //exibirListaD(lista);

    return 1;
}