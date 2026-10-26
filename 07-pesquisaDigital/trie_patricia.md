# Pesquisa Digital: TRIE e PATRICIA

As árvores Trie e PATRICIA são estruturas de dados baseadas em pesquisa digital, o que significa que elas buscam informações caractere por caractere (ou bit a bit) em vez de comparar a chave inteira de uma vez só (como ocorre em uma árvore binária tradicional). Elas são amplamente utilizadas para buscas de prefixos, sistemas de autocompletar e roteamento de redes.
A principal diferença entre elas está na forma como lidam com o espaço na memória: enquanto a Trie padrão cria um nó para cada caractere, a PATRICIA compacta a estrutura unindo caminhos que não se ramificam.

## 1. Árvore Trie (Árvore de Prefixo)

A Trie (derivada da palavra retrieval) armazena chaves (geralmente strings) de forma que cada nó representa um único caractere.
• Como funciona: Se você inserir as palavras "AMOR", "AMAR" e "GATO", a árvore compartilhará o prefixo "AM" para as duas primeiras palavras. O caminho para "AMOR" se dividirá no 'O' e o de "AMAR" no 'A'.
• Vantagem: A busca é extremamente rápida. O tempo de busca depende apenas do tamanho da palavra que você está procurando, e não do número total de palavras salvas na árvore.
• Desvantagem: Alto desperdício de memória. Se houver sequências longas de caracteres sem nenhuma ramificação (como a palavra "CONSTITUCIONAL"), a árvore criará um nó separado para cada letra, gerando muitos ponteiros nulos.

## 2. Árvore PATRICIA (Trie Compacta)

A árvore PATRICIA (Practical Algorithm To Retrieve Information Coded In Alphanumeric) resolve o problema de desperdício de memória da Trie padrão através da compactação de caminhos.
• Como funciona: Sempre que um nó possui apenas um filho, ele é mesclado (compactado) com o nó pai. Em vez de testar caractere por caractere em nós separados, a PATRICIA armazena sequências de caracteres nos nós ou utiliza um índice para indicar qual bit/caractere deve ser testado na busca.
• Exemplo visual: Na palavra "GATO", se não houver nenhuma outra palavra começando com 'G', a Trie comum criaria 4 nós (G -> A -> T -> O). A PATRICIA cria um único nó contendo a string inteira "GATO".
• Vantagem: Muito mais econômica em termos de espaço de memória, mantendo a mesma velocidade de busca eficiente da Trie.

## Comparação Direta

| Característica | Árvore Trie Padrão | Árvore PATRICIA |
| :--- | :--- | :--- |
| **Estrutura do Nó** | Cada nó armazena um único caractere (ou caractere por caractere nos caminhos). | Nós agrupam sequências de caracteres ou indicam a posição do próximo teste. |
| **Gasto de Memória** | Alto (muitos nós intermediários com apenas um filho). | Baixo (otimizada eliminando nós redundantes). |
| **Ramificações** | Pode ter nós com apenas um filho. | Todos os nós internos possuem pelo menos duas ramificações. |
| **Complexidade** | Mais simples de entender e implementar. | Implementação e lógica de remoção/inserção mais complexas. |

## Simular a inserção do seguinte conjunto de palavras: "AMAR", "AMOR" e "GATO".

### 1. Estrutura na Árvore Trie Padrão

Na Trie padrão, cada caractere vira um nó individual. Se não houver ramificação, o caminho continua descendo letra por letra:

       [ Raiz ]
      /        \
    [A]        [G]

     |          |
    [M]        [A]
   /   \        |
 [A]   [O]      [T]

  |     |       |
 [R]*  [R]*     [O]*

(O caractere * indica o fim de uma palavra válida).

  - Análise: Repare na palavra "GATO". Como não há nenhuma outra palavra que comece com "G", ela gera um caminho linear de 4 nós (G -> A -> T -> O). Isso gera um grande desperdício de memória e ponteiros.

### 2. Estrutura na Árvore PATRICIA (Trie Compacta)

A árvore PATRICIA elimina os nós redundantes de filho único, agrupando os caracteres que não se ramificam em um único bloco:

       [ Raiz ]
      /        \
   "AM"       "GATO"*
   /   \
 "AR"* "OR"*

  - Análise: O prefixo comum "AM" foi mantido, mas as terminações "AR" e "OR" foram compactadas em nós únicos após a ramificação. O termo "GATO" não possui ramificações, por isso foi totalmente compactado em um único nó logo abaixo da raiz.

### Resumo do Ganho de Espaço

  - Trie Padrão: Precisou de 9 nós no total para armazenar as 3 palavras.
  - PATRICIA: Precisou de apenas 4 nós no total para armazenar exatamente as mesmas palavras.

## Código Python

```python
class NodeTrie:
    def __init__(self):
        # Cada nó possui um dicionário de filhos (caractere -> NodeTrie)
        self.filhos = {}
        # Flag para indicar se o nó atual marca o fim de uma palavra válida
        self.fim_da_palavra = False

class Trie:
    def __init__(self):
        self.raiz = NodeTrie()

    def inserir(self, palavra: str) -> None:
        """Insere uma palavra na árvore caractere por caractere."""
        no_atual = self.raiz
        for caractere in palavra:
            # Se o caractere não existir nos filhos do nó atual, cria um novo nó
            if caractere not in no_atual.filhos:
                no_atual.filhos[caractere] = NodeTrie()
            # Avança para o nó filho
            no_atual = no_atual.filhos[caractere]
        # Ao final da palavra, marca o nó como o fim de uma palavra válida
        no_atual.fim_da_palavra = True

    def buscar(self, palavra: str) -> bool:
        """Busca se uma palavra exata existe na árvore."""
        no_atual = self.raiz
        for caractere in palavra:
            if caractere not in no_atual.filhos:
                return False
            no_atual = no_atual.filhos[caractere]
        return no_atual.fim_da_palavra

    def comeca_com(self, prefixo: str) -> bool:
        """Verifica se existe alguma palavra na árvore que começa com o prefixo dado."""
        no_atual = self.raiz
        for caractere in prefixo:
            if caractere not in no_atual.filhos:
                return False
            no_atual = no_atual.filhos[caractere]
        return True

# --- Testando a implementação ---
if __name__ == "__main__":
    trie = Trie()
    
    # Inserindo as palavras do nosso exemplo anterior
    palavras = ["AMAR", "AMOR", "GATO"]
    for p in palavras:
        trie.inserir(p)
    
    # Testes de busca exata
    print(trie.buscar("AMOR"))   # Saída: True
    print(trie.buscar("AMO"))    # Saída: False (Existe o prefixo, mas não a palavra exata)
    print(trie.buscar("CÃO"))    # Saída: False
    
    # Testes de busca por prefixo (Autocompletar)
    print(trie.comeca_com("AM"))  # Saída: True (Atende a "AMAR" e "AMOR")
    print(trie.comeca_com("GA"))  # Saída: True (Atende a "GATO")
    print(trie.comeca_com("XE"))  # Saída: False

```

