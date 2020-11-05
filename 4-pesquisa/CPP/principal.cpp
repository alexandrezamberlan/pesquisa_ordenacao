#include <iostream>
#include <time.h>
#include "../../3-ordenacao/CPP/utilidades.h"
#include "../../3-ordenacao/CPP/metodosOrdenacao.h"
#include "metodosPesquisa.h"

using namespace std;

int main() {
    clock_t tempoInicio, tempoFim;
    long long int tamanho;

    system("clear");//no windows é system("cls");

    cout << "Tamanho do vetor ou lista: ";
    cin >> tamanho;
    
    int numero;
    int *vetorSequencial, *vetorBinario;
    vetorSequencial = (int*)malloc(sizeof(int) * tamanho);
    vetorBinario = (int*)malloc(sizeof(int) * tamanho);
    
    printf("Vetor para pesquisa sequencial... desordenado\n");
    popula(vetorSequencial, tamanho);
    exibe(vetorSequencial, tamanho);

    printf("Informe um inteiro para pesquisa: ");
    scanf("%d", &numero);

    // printf("O %d encontra-se nas posições: ", numero);
    // pesquisaSequencialMostraTodasAsPosicoes(numero, vetorSequencial, tamanho);
    
    Celula *ocorrencias = NULL;
    ocorrencias = pesquisaSequencialRetornaTodasAsOcorrencias(numero, vetorSequencial, tamanho);
    printf("O %d encontra-se nas posições: \n", numero);
    exibirLista(ocorrencias);



    // printf("Vetor para pesquisa binária... deve estar ordenado");
    // popula(vetorBinario, tamanho);
    // pente(vetorBinario, tamanho);
    // exibe(vetorBinario, tamanho);


    return 1;
}