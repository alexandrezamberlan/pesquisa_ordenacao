#include <iostream>
#include <stdlib.h>
#include <time.h>
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

    cout << "Quantos números deseja gerar? ";
    cin >> quantidade;

    vetor = popular(vetor, quantidade);
    exibir(vetor, quantidade);

    return 1;
}