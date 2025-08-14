# Ordenação

# Conceitos e fundamentos
    - O que é ordenar: organizar uma estrutura de dados (cresc ou decresc) usando uma ou mais chaves de controles (variável)
    - Por que ordenar? porque estruturas ordenadas tem a busca ou a pesquisa mais eficiente, devido aos algoritmos baseados em árvores
    - Categorias de ordenação para os algoritmos
        - memória interna ou memória externa
        - estabilidade do algoritmo
            estável: o processo de ordenação sempre garante a ordenação temporária da estrutura
                [4,8,1,3,4,2]
                [4,1,3,4,2,8]
                [1,3,4,2,4,8]
                [1,3,2,4,4,8]
                [1,2,3,4,4,8]
                [1,2,3,4,4,8]
            
            instável: o processo de ordenação não garante a ordenação temporária da estrutura
                [4,8,1,3,4,2]
                [1,8,4,3,4,2]
                [1,2,4,3,4,8]
                [1,2,3,4,4,8]
                [1,2,3,4,4,8]
                [1,2,3,4,4,8]
                Adequados para listas feitas em C ou C++ com alocação dinâmica de memória, como trabalhado na disciplina Estruturas de Dados


            Obs.: ao ordenar os algoritmos garantem porções ordenadas na estrutura:
                - final
                - frente
                - nas extremidades (piramide invertida)

        - complexidade computacional: é a quantidade de esforço computacional (tarefas, rotinas, métodos) envolvido no algoritmo
            - Na ordenação a complexidade dos algoritmos é medida pela quantidade de:
                - comparações
                - trocas
                Categorias:
                    Complexidade fatorial       - O(n!)         - menos eficiente
                    Complexidade ??             - O(n^k) 
                    Complexidade Exponencial    - O(n^2)
                    Complexidade Linear         - O(n)
                    Complexidade Logaritmica    - O(log n)      - mais eficaz

## Atividade de fixação
    1) pesquisar na literatura, internet ou IA Generativa sobre os métodos de ordenação e categoriza-los em:
        - algoritmo de memória interna ou memória externa
        - estabilidade (estável ou instável)
        - complexidade
        - porções de ordenação

    Pesquisar os seguintes métodos de ordenação:
        - bolha (bubble sort)
            - memória interna
            - estável
            - O(nˆ2)
            - porção ordenada: final

        - seleção (selection sort)
        - inserção (inserction sort)
        - pente (combsort)
        - agitação (shakesort ou cocktailsort)
        - shellsort
        - heapsort
        - mergesort
        - quicksort
        - bucketsort
        - radix









# Comentários
    eficiente versus eficaz 
        - ambos atingem objetivos