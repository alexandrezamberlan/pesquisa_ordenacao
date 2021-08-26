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
    vetorBolha = (int*)malloc(sizeof(int) * tamanho);
    popular(vetorBolha, tamanho);
    // exibir(vetorBolha, tamanho);

    //bolha
    tempoInicio = clock();
    bolha(vetorBolha,tamanho);
    tempoFim = clock();
    cout << "Tempo para bolha: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
    // exibir(vetorBolha, tamanho);

    return 1;
}