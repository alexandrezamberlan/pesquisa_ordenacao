#include <iostream>
#include <time.h>
using namespace std;

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

int main() {
    clock_t tempoInicio, tempoFim;
    long long int tamanho;

    cout << "Tamanho do vetor: ";
    cin >> tamanho;

    int *vetor;
    vetor = (int*)malloc(sizeof(int) * tamanho);

    popula(vetor, tamanho);

    tempoInicio = clock();
    bolha(vetor,tamanho);
    tempoFim = clock();
    cout << "Tempo para ordenar: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;

    // cout << "Digite c para continuar! ";
    // char c;
    // cin >> c;

    // tempoInicio = clock();
    // exibe(vetor, tamanho);
    // tempoFim = clock();
    // cout << "Tempo para exibir: "<< (float)(tempoFim - tempoInicio)/10000 << endl;
    return 1;
}