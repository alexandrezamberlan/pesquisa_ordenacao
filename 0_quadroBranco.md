# Plano de aula

O(n!)
O(n^k)
O(n^2)
O(n log n)
O(n)
O(log n)


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

        def esta_ordenado(lista):
            for i in range(0, len(lista)-1):
                if list[i] > lista[i+1]:
                    return False

            return True


        - Da a sequência de valores na estrutura abaixo, contabilize quantas comparações e quantas trocas há para os métodos:
            - bolha - 56 comparações e 22 trocas 
            - pente - 35 comparações e e 8 trocas
            - seleção

            0   1   2   3   4   5   6   7   8
            30  90  10  20  80  10  20  40  10      dist = 6
            20  40  10  20  80  10  30  90  10      dist = 4
            20  10  10  20  10  40  30  90  80      dist = 3
            20  10  10  20  10  40  30  90  80      dist = 2
            10  10  10  20  20  40  30  90  80      dist = 1
            10  10  10  20  20  30  40  80  90      dist = 1
            10  10  10  20  20  30  40  80  90
            
        - Na sua linguagem de preferência, implemente (sem consulta) seu método escolhido para saber.

        def pente(lista):
            qtd_comparacoes = 0
            qtd_trocas = 0
            distancia = len(lista)
    
            while (True):
                distancia = int(distancia / 1.3)
                if (distancia < 1):
                    distancia = 1
                houve_troca = False
                for (i in range(0, len(lista)-distancia)):
                    qtd_comparacoes+=1
                    if (lista[i] > lista[i+distancia]):
                        qtd_trocas+=1
                        tmp = lista[i]
                        lista[i] = lista[i+distancia]
                        lista[i+distancia] = tmp
                        houve_troca = True

                if distancia == 1 and not houve_troca:
                    break
                
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
