Pesquisa e ordenação

1) O que é ordenar?
    - organizar (crescente ou decrescente) uma estrutura de dados obedecendo um critério (chave ou chaves)
2) Por que ordenar?
    - otimizar as buscas ou pesquisas
3) Os algoritmos de ordenação são categorizados por:
    - complexidade - esforço computacional (temporal) ou memória ocupada (espacial)
    - estabilidade - 
        - no processo de ordenação, mantem-se a ordenação
        - no processo de ordenação, há uma 'bagunça' temporaria na estrura 
Explique os conceitos de complexidade e estabilidade.

4) Qual ou quais os melhores métodos de ordenação?
    - Depende: 
        - tamanho da estrutura
        - quanto a estrutura já está organizada

    - Os métodos com complexidade baixa:
        - Quick
            - complexidade temporal - O(log n)
            - complexidade espacial - O(1)
        - Merge
            - complexidade temporal - O(log n)
            - complexidade espacial - O(n)

5) O que tem em comum os métodos bolha, seleção e inserção?
    Todos têm complexidade temporal alta - O(n^2)
    Complexidade espacial O(1)

```
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

```
void selecao(int vetor[], int n) {
    int i, j, posMenor, aux;
    
    for (i = 0; i < n; i++) {
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

```
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
