# Plano de aula

## Aula Semana 14
    - Revisão geral: Pesquisa
    - Pesquisa:
        - o que é e para que serve?
        - localizar versus recuperar
        - complexidade das pesquisas: sequencial, binária, digital, hash
        - fluxo: armazenar, "ordenar" , pesquisar
        - saber os algoritmos
            - pesquisa binária
            - pesquisa digital
        - teoria de tabelas hash
            - tabela
            - função hash de endereçamento

## Aula Semana 13
    - Tabelas hash e função de espalhamento (endereçamento)
    
## Aula Semana 12    
    - Correção do trabalho Java Gráfico Benchmark Ordenação
    
## Aula Semana 11
    - Java Swing: eventos keypressed, keyreleased, keytyped
    - Trabalho sobre pesquisa digital

## Aula Semana 10
    - Pesquisa sequencial
    - Pesquisa binária
    - Pesquisa digital

## Aula Semana 9
    - Discussão sobre a prova
    - Heapsort

## Aula Semana 8
    - Prova teórica

## Aula Semana 7
    - PRINCÍPIO DIVIDIR PARA CONQUISTAR
        - Características clássicas/comuns:
            - RECURSÃO: chamada do próprio método. Vantagem: simplficidade no código; Desvantagem: consumo excessivo de memória RAM
            - a cada processo de recursão, tanto quick quanto merge dividem o vetor/estrutura como se fossem folhas de uma árvore
            - ambos os métodos, na recursão, mais precisamente no empilhamento, eles dividem as estruturas. Porém, na volta do empilhamento, no retorno da recursão que ocorre a ordenação
        - Quicksort
            - C# implementa seu sort com ele
            - usa uma variável chamada PIVO para repartir/dividir (recursivo), em que os menores devem estar a sua esquerda, enquanto os maiores a sua direita
        - Mergesort
            - Java implementa seu sort com ele
            - usa 3 variáveis: ini (que marca o lado esquerdo), fim (que marca o lado direito) e o meio
        
    - Heapsort
        - baseado na filosofia de árvore.... 

    - Complexidades
        - O(n!)
        - O(n^k)
        - O(n^2)
        - O(n log n)
        - O(n)
        - O(log n)

## Aula Semana 6
    - Revisão: bolha, seleção, inserção, agitação, pente, shell
        - O que é ordenação e por que é importante ordenar estruturas de dados?
        - Dos vários algoritmos de ordenação, há categorias que os classificam, como:
            - estabilidade
            - complexidade
            Explique o que é estabilidade e complexidade. Se necessário, dar exemplos. Quais os métodos estudados que são estáveis e quais que são instáveis
        - Dos métodos estudados, quais suas complexidades? Como é avaliada a complexidade de um método de ordenação?
        - Dos métodos estudados, qual o melhor método de ordenação?
        - Faça um método na sua linguagem de preferência que retorne true/True se a lista enviada como parâmetro está ordenada, o false/False caso contrário


        - Da a sequência de valores na estrutura abaixo, contabilize quantas comparações e quantas trocas há para os métodos:
            - bolha - 56 comparações e 22 trocas 
            - pente - 35 comparações e e 8 trocas
            - seleção

            0   1   2   3   4   5   6   7   8
            30  90  10  20  80  10  20  40  10     
                        
        - Na sua linguagem de preferência, implemente (sem consulta) seu método escolhido para saber.
    
        - Como ordenar pela segunda ou terceira chave
            Exemplo uma lista de Alunos(codigo, curso, nome) - ordenar por curso e ordenar por nome

## Aula Semana 5
    - Ordenação
        - implementação simples, porém alta complexidade O(n^2): quantidade de comparação e quantidade de trocas = ESFORÇO
            - bolha: estavel; parte ordenada é no final
            - seleção: instavel; parte ordenada é no início
            - inserção: estavel; parte ordenada é no início
        - incrementos ou melhorias dos métodos bolha e inserção
            - técnica de análise de dois elementos distantes n posições: pré-organiza e diminui o número de trocas
                - variável distância - h
            - do bolha há o pente - combsort
            - do inserção há o shellsort
            - do bolha há o shakesort ou cocktailsort ou agitação (sem uso de distância)
                - ordena da esquerda para direita e da direita para esquerda,                

## Aula Semana 4
    - Ordenação
        - sort - método de ordenação nativo das linguagens
        - bolha
        - seleção
        - inserção

## Aula Semana 3
    - Conceitos e fundamentos associados à ordenação
    - Discutir e implementar técnicas de medição de tempo nas linguagens

## Aula Semana 2
    - Realização do desafio

## Aula Semana 1
    - Dicusssão e entendimento do Plano de Ensino
        - ordenação: conceitos; algoritmos
        - pesquisa: conceitos; algoritmos
        - pesquisa digital: algoritmos
        - tabelas hash: conceitos; algoritmos
        - balanceamento em árvores: conceitos; algoritmos
        - árvores B: conceitos; algoritmos
    - Revisão
        - orientação a objetos: estruturação de códigos: popular, exibir, ... OO com métodos de classe (static)
        - estruturas de dados: listas nas 3 linguagens
    - Desafio: a partir dos códigos gerados em Java, C# e Python, adicionar os métodos de popular lista a partir de arquivos, tanto para listas com números inteiros, quanto para lista de palavras     
