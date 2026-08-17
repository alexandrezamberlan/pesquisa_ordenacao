# Plano de aula

## Aula Semana 16:
    Desafio da Telefonia
    Descrição da situação: 
        1) há um arquivo de log (telephony_sessions.txt) com números de telefone celular mais dados da sessão de clientes de uma operadora. Por exemplo:

        5591999123456;{"session_id":"uuid","imsi":"123456789012345","imei":"356789012345678",
                        "mcc":"724","mnc":"01","cell_id":12345,"lac":54321,"bearer":"LTE",
                        "start_time":"2025-11-05T12:34:56Z","end_time":"2025-11-05T12:45:10Z",
                        "duration_s":614,"ip_addr":"10.23.5.6","sip_call_id":"uuid2","codec":"AMR-WB",
                        "bytes_up":12345,"bytes_down":456789,"lat":-23.550520,"lon":-46.633308,"encryption":"SRTP"}
        
        2) Construa um programa em modo texto (ou gráfico em Java se preferir), orientado a objetos que:
            a) carregue a base de informações das sessões de telefones (telephony_sessions.txt)
            b) armazene essa base em uma estrutura de dados do tipo HashMap
            c) cada par, número do celular (string) e dados da sessão (string), deve ser convertido em um objeto e dicionário a ser armazenado no HashMap, sendo que o número do celular é a chave para o cálculo de endereçamento
            d) tenha uma funcionalidade em que o usuário entra com o número de celular e o programa retorna a string contendo todos os dados da sessão.
        3) Construa um menu para atender a demanda

## Aula Semana 15
    Avaliação teórica

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

## Aula Semana 10
    - Fazer uma função que retorne True se a lista está em heap máximo
    - Fazer um programa que:
        - armazene milhoes de números inteiros ou pouco repetidos (desordenados)
        - localize o menor número gerado
        - retorne o número
        - temporize esse processamento
        - contabilize o número de comparações

    - Pesquisa sequencial e pesquisa binária
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
        - agitação
    - Tarefa avaliativa: a partir dos códigos trabalhados (bolha, seleção, inserção e agitação), refatora-los para que funcionem em uma organização MVC. Os algoritmos de ordenação devem estar na classe Ordenacao e serem estáticos. Além disso, é preciso contabilizar números de comparações e trocas, bem como o tempo de execução de cada um. Todas essas operações já foram trabalhadas. O sistema solicitado deve ser disponibilizado no github pessoal de cada aluno.

## Aula Semana 3
    - Conceitos e fundamentos associados à ordenação
    - Discutir e implementar técnicas de medição de tempo nas linguagens

## Aula Semana 2
    - Realização do desafio da ideia MVC

## Aula Semana 1
    - Dicusssão e entendimento do Plano de Ensino
        - ordenação: conceitos; algoritmos
        - pesquisa: conceitos; algoritmos
        - pesquisa digital: algoritmos
        - tabelas hash: conceitos; algoritmos
        - balanceamento em árvores: conceitos; algoritmos
        - árvores B: conceitos; algoritmos
    
    - Conceitos iniciais
        - ordenar: organizar uma estrutura (lista ou vetor) a partir de um ou mais índices ou chaves
            - por que ordenar?
                - para otimizar a busca ou pesquisa
        - pesquisar: localizar ou buscar um dado dentro de uma estrutura via alguma chave
            - recuperar: localizar ou buscar dados com relevância (semântica ou significado)
        - complexidade de um algoritmo: é o esforço computacional de um algoritmo, ou seja, quanto de recurso ele aloca para realizar sua ou suas tarefas
            - alta complexidade: mais esforço
            - baixa complexidade: menos esforço
            - Notação Big O
                - O(n!)             - maior complexidade
                - O(n^x)
                - O(log n + n)
                - O(n)
                - O(log n)          - menor complexidade
        - estabilidade
            - quanto a estrutura é desordenada até chegar na ordenação
    - Revisão
        - https://github.com/alexandrezamberlan/estruturasDeDados/tree/master/00%20-%20anosAnteriores/exemploJava_usoLista_MVC
        - orientação a objetos: estruturação de códigos: popular, exibir, ... OO com métodos de classe (static)
        - estruturas de dados: listas nas 3 linguagens
    - Desafio: a partir dos códigos gerados em Java, C# e Python, adicionar os métodos de popular lista a partir de arquivos, tanto para listas com números inteiros, quanto para lista de palavras     
