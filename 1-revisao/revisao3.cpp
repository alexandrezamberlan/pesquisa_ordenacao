#include <iostream>
#include <time.h>
#include <stdlib.h>

using namespace std;

int * popular(int *v, int n) {
    //criou um vetor com n posições
    v = (int*)malloc(sizeof(int*) * n);

    //colocou números aleatórios no vetor
    srand(time(NULL));
    for (int i = 0; i < n; i++) {
        v[i] = rand() % 100;
    }
    return v;
}

void exibir(int *v, int n) {
    for (int i = 0; i < n; i++) {
        cout << v[i] << endl;
    }
}

int main() {
    int *vetor;
    int quantidade;
    clock_t tempoInicio, tempoFim;

    cout << "Quantos números deseja gerar? ";
    cin >> quantidade;

    //temporizar
    tempoInicio = clock();
    vetor = popular(vetor, quantidade);
    // exibir(vetor, quantidade);
    tempoFim = clock();
    cout << "Tempo de processamento: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
}