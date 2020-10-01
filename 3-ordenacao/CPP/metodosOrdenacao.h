#include "utilidades.h"
#include <iostream>

using namespace std; 

void bolha(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        houveTroca = false;
        for (i = 0; i < n-1; i++) {
            qtdComparacoes++;
            if (vetor[i] > vetor[i+1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = tmp;
                qtdTrocas++;  
            }
        }
    } while (houveTroca);
    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
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
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    for (i = 0; i < n-1; i++) {
        posMenor = i;
        for (j = i + 1; j < n; j++ ) {
            qtdComparacoes++;
            if (vetor[j] < vetor[posMenor]) {
                posMenor = j;
            }
        }
        if (i != posMenor) { 
            tmp = vetor[i];
            vetor[i] = vetor[posMenor];
            vetor[posMenor] = tmp;
            qtdTrocas++;
        }
    }
    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
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

void insercao(int *vetor, long long int n) {
    long long int i, j;
    int tmp;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    for (i = 1; i < n; i++) {
        tmp = vetor[i];
        for (j = i - 1; j >= 0; j--) {
            qtdComparacoes++;
            if (tmp < vetor[j]) {
                vetor[j + 1] = vetor[j];
                qtdTrocas++;
            } else break;
        }
        vetor[j + 1] = tmp;
        qtdTrocas++;
    }
    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
}

CelulaD *insercaoLista(CelulaD *l) {
    CelulaD *i, *j;
    int tmp;
    
    if (!l) return l;

    while (l->ant)
        l = l->ant;

    for (i = l->prox; i; i = i->prox) {
        tmp = i->dado;
        for (j = i->ant ; j ; j = j->ant) {
            if (tmp < j->dado) {
                j->prox->dado = j->dado;
            } else break;
        }
        if (!j) l->dado = tmp; //inserindo na primeira posição da lista
        else j->prox->dado = tmp; //inserindo na posição adequada
    }

    return l;
}

void agitacao(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i, ini = 0, fim = n - 1;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        //aplicando o bolha da esquerda para direita
        houveTroca = false;
        for (i = ini; i < fim; i++) {      
            qtdComparacoes++;      
            if (vetor[i] > vetor[i+1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = tmp;
                qtdTrocas++;
            }
        }
        fim--;

        if (!houveTroca) {
            break;
        }

        //aplicando o bolha da direita para esquerda
        houveTroca = false;
        for (i = fim; i > ini; i--) {
            qtdComparacoes++;
            if (vetor[i] < vetor[i-1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i-1];
                vetor[i-1] = tmp;
                qtdTrocas++;
            }
        }
        ini++;

    } while (houveTroca && ini <= fim);

    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
}

CelulaD *agitacaoLista(CelulaD *l) {
    bool houveTroca;
    int tmp;
    CelulaD *i, *ini, *fim;
    if (!l) return l;
    while (l->ant)
        l = l->ant;
    ini = l;
    fim = l;
    while (fim->prox) 
        fim = fim->prox;
    do {
        //aplicando o bolha da esquerda para direita
        houveTroca = false;
        for (i = ini; i->prox != fim; i = i->prox) {      
            if (i->dado > i->prox->dado) {
                houveTroca = true;
                tmp = i->dado;
                i->dado = i->prox->dado;
                i->prox->dado = tmp;
            }
        }
        fim = fim->ant;
        if (!houveTroca) {
            break;
        }
        //aplicando o bolha da direita para esquerda
        houveTroca = false;
        for (i = fim; i->ant != ini; i = i->ant) {
            if (i->dado < i->ant->dado) {
                houveTroca = true;
                tmp = i->dado;
                i->dado = i->ant->dado;
                i->ant->dado = tmp;
            }
        }
        ini = ini->prox;
    } while (houveTroca && fim->prox != ini);

    return l;
}

void pente(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i;
    long long int distancia = n;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        distancia = (int)distancia / 1.3;
        if (distancia < 1) distancia = 1;

        houveTroca = false;
        for (i = 0; i < n - distancia; i++) {
            qtdComparacoes++;
            if (vetor[i] > vetor[i+distancia]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+distancia];
                vetor[i+distancia] = tmp;
                qtdTrocas++;  
            }
        }
    } while (distancia > 1 || houveTroca);
    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
}
