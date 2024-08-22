Pesquisa e ordenação

1) O que é ordenar?
    
2) Por que ordenar?
    
3) Os algoritmos de ordenação são categorizados por:
Explique os conceitos de complexidade e estabilidade.

4) Qual ou quais os melhores métodos de ordenação?    

5) O que tem em comum os métodos bolha, seleção e inserção?
    Todos têm complexidade temporal alta - O(n^2)
    Complexidade espacial O(1)

```c
void bolha(int vetor[], int n) {
    int i, aux, houveTroca;
    do {
        houveTroca = 0;
        for (i = 0; i < n-1; i++) {
            if (vetor[i] > vetor[i+1]) {
                houveTroca = 1;
                aux = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = aux;
            }
        }
    } while (houveTroca);
}
```

```c
void selecao(int vetor[], int n) {
    int i, j, posMenor, aux;
    
    for (i = 0; i < n-1; i++) {
        posMenor = i;
        for (j = i+1; j < n; j++) {
            if (vetor[j] < vetor[posMenor]) {
                posMenor = j;
            }
        }
    }
    if (posMenor != i) {
        aux = vetor[i];
        vetor[i] = vetor[posMenor];
        vetor[posMenor] = aux;
    }
}
```

```c
void insercao(int vetor[], int n) {
    int i, j, aux;

    for (i = 1; i < n; i++) {
        aux = vetor[i];
        for (j = i-1; j > 0 && aux < vetor[j]; j--) {
            vetor[j+1] = vetor[j];
        }
        vetor[j+1] = aux;
    }
}
```
