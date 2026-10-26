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


