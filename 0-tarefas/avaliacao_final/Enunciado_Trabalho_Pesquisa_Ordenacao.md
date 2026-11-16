# Trabalho Prático – Pesquisa e Ordenação

**Universidade Franciscana – UFN**
Curso de Ciência da Computação

| | |
|---|---|
| **Disciplina** | Pesquisa e Ordenação |
| **Professor** | Alexandre Zamberlan |
| **Duração** | 3 horas |
| **Tema** | Catálogo de produtos: comparando ordenação e busca |
| **Linguagem / recursos** | Java, Swing, arquivos texto e HashMap |

---

## 1. Objetivo

Neste trabalho você vai desenvolver, em Java, um programa com interface Swing que carrega um arquivo com milhares de produtos, ordena esses dados com algoritmos implementados por você, busca produtos por diferentes técnicas e compara o desempenho de cada abordagem, inclusive com o uso de `HashMap`. O objetivo é perceber, com medições reais, como a escolha do algoritmo e da estrutura de dados afeta o tempo de execução.

## 2. Arquivos fornecidos

São entregues três arquivos de dados, com os mesmos campos e tamanhos diferentes, e um programa gerador (`GeradorProdutos.java`), caso você queira criar outros tamanhos.

| Arquivo | Registros | Uso sugerido |
|---|---:|---|
| `produtos_1000.txt` | 1.000 | Desenvolvimento e testes |
| `produtos_10000.txt` | 10.000 | Medição intermediária |
| `produtos_50000.txt` | 50.000 | Medição de carga |

**Formato:** uma linha por produto, campos separados por ponto e vírgula, codificação UTF-8. A primeira linha é um cabeçalho e deve ser ignorada na leitura. O preço usa ponto como separador decimal.

```
id;nome;categoria;preco;estoque
1415;Bola de Vôlei Premium 896;Esportes;661.97;13
1436;Quebra-Cabeça Eco 135;Brinquedos;1242.59;237
```

O campo `id` é único em cada arquivo e os registros estão fora de ordem. Há 12 categorias, que se repetem em vários produtos.

## 3. O que deve ser desenvolvido

### 3.1 Modelo e arquivos (tempo sugerido: 30 min)

- Criar a classe `Produto` com os campos `id`, `nome`, `categoria`, `preco` e `estoque`.
- Ler o arquivo escolhido para uma `ArrayList<Produto>`, ignorando o cabeçalho.
- Exportar a lista, na ordem em que estiver no momento, para um novo arquivo texto no mesmo formato.

### 3.2 Ordenação (tempo sugerido: 50 min)

- Implementar à mão **dois algoritmos**: um simples (Bubble, Selection ou Insertion Sort) e um eficiente (Merge ou Quick Sort).
- Permitir ordenar por **nome** (texto, usando `compareTo` ou `compareToIgnoreCase`) e por **preço** (numérico), por meio de `Comparator`.
- Medir o tempo de cada ordenação com `System.nanoTime()` e exibi-lo ao usuário.
- `Collections.sort` e `List.sort` podem ser usados apenas como referência de comparação. Eles não contam como algoritmo implementado.

### 3.3 Busca (tempo sugerido: 50 min)

- Buscar um produto por **id** usando três técnicas:
  - **busca linear** sobre a lista;
  - **busca binária** sobre a lista ordenada por id;
  - consulta a um **`HashMap<Integer, Produto>`** montado na carga dos dados.
- Listar todos os produtos de uma **categoria** usando um `HashMap<String, List<Produto>>` como índice.
- Medir e exibir o tempo de cada busca. Como uma busca isolada é muito rápida, repita-a várias vezes (por exemplo, 1.000) e apresente o tempo médio.
- **Atenção:** a busca binária só funciona se a lista estiver ordenada pelo mesmo campo buscado.

### 3.4 Interface Swing (tempo sugerido: 30 min)

- `JTable` exibindo os produtos.
- Componentes para escolher o arquivo, o campo e o algoritmo de ordenação, e a técnica de busca.
- Campo de texto para informar o id ou a categoria buscados, e um `JLabel` com o tempo da última operação.
- A interface pode ser simples. Priorize o funcionamento dos algoritmos.

### 3.5 Relatório de tempos (tempo sugerido: 20 min)

- O programa deve gerar automaticamente o arquivo `relatorio.txt`, com os tempos de cada algoritmo de ordenação e de cada técnica de busca para 1.000, 10.000 e 50.000 registros.
- Se o algoritmo simples levar mais de 2 minutos com 50.000 registros, interrompa e registre "não concluído (> 2 min)".
- Ao final do relatório, responda em até 5 linhas: qual técnica de busca foi mais rápida e por quê; e quando vale pagar o custo de construir o `HashMap`.

*Modelo da tabela do relatório:*

| Operação | 1.000 | 10.000 | 50.000 |
|---|:---:|:---:|:---:|
| Ordenação simples (por preço) | | | |
| Ordenação eficiente (por preço) | | | |
| Busca linear por id (média) | | | |
| Busca binária por id (média) | | | |
| Busca por HashMap (média) | | | |
| Construção do HashMap | | | |

## 4. Sugestão de organização do código

- **`Produto`**: dados do produto.
- **`GerenciadorArquivos`**: leitura e escrita dos arquivos texto.
- **`Ordenador`**: algoritmos de ordenação, recebendo a lista e um `Comparator`.
- **`Buscador`**: busca linear, binária e por `HashMap`.
- **`TelaPrincipal`**: interface Swing, que apenas chama as classes anteriores.

Separar a lógica da interface facilita testar os algoritmos e gerar o relatório sem depender da tela.

## 5. Cronograma sugerido

| Tempo | Atividade |
|---|---|
| 0:00 – 0:30 | Modelo, leitura e escrita de arquivos |
| 0:30 – 1:20 | Algoritmos de ordenação e medição de tempo |
| 1:20 – 2:10 | Técnicas de busca e `HashMap` |
| 2:10 – 2:40 | Interface Swing |
| 2:40 – 3:00 | Relatório e entrega |

## 6. Entrega

- Projeto Java completo, compactado em `.zip`, contendo o código-fonte e o arquivo `relatorio.txt` gerado.
- Identifique o(s) autor(es) com nome e turma em um comentário no início da classe principal.
- O programa deve compilar e executar sem alterações, lendo os arquivos de dados a partir da pasta do projeto.

## 7. Critérios de avaliação (5 pontos)

| Critério | Pontos |
|---|---:|
| Leitura e escrita corretas dos arquivos | 0,5 |
| Dois algoritmos de ordenação implementados e corretos, por dois critérios | 1,5 |
| Busca linear, binária e por `HashMap` corretas | 1,5 |
| Medição de tempo e relatório com análise | 1,0 |
| Interface Swing funcional | 0,5 |
| **Total** | **5,0** |

