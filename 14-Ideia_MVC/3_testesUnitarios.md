# Testes unitários

O padrão MVC é maravilhoso para testes unitários porque as responsabilidades estão bem isoladas.
 
Como o  Model não depende de terminal e nem de interfaces gráficas, testá-lo é extremamente simples e rápido. 
No ecossistema Python, a ferramenta padrão e mais utilizada pelo mercado para isso é o Pytest. 

### Vamos configurar a estrutura de testes no seu projeto e integrá-la ao VS Code.

## 1. Nova Estrutura de Pastas

Crie uma pasta chamada tests na raiz do seu projeto. Dentro dela, crie um arquivo chamado test_model.py.
Seu projeto deve ficar assim:

```
meu_projeto/
│
├── .vscode/          # Pasta criada pelo debugger
├── controller/
├── model/
├── view/
├── tests/            # Nova pasta para seus testes
│   └── test_model.py # Arquivo de testes do Model
├── main.py
└── requirements.txt  # (Opcional) Para listar dependências como o pytest
```

## 2. Escrevendo os Testes Unitários (tests/test_model.py)
No Pytest, cada função de teste deve obrigatoriamente começar com o prefixo test_. 
Vamos testar se o seu ListaModel está gerando as listas corretamente.

Cole o código abaixo no tests/test_model.py:

```
from model.model import ListaModel

def test_popular_lista_aleatoria():
    """Garante que a lista aleatória tem o tamanho correto e respeita os limites."""
    model = ListaModel()
    quantidade = 10
    inicio = 100
    fim = 1000
    
    model.popular_lista_aleatoria(quantidade, inicio, fim)
    lista = model.get_lista_aleatoria()
    
    # Verifica se a lista tem exatamente o tamanho solicitado
    assert len(lista) == quantidade
    
    # Verifica se todos os números gerados estão dentro do intervalo correto
    for numero in lista:
        assert inicio <= numero < fim

def test_popular_lista_sequencial():
    """Garante que a lista sequencial gera números em ordem correta."""
    model = ListaModel()
    quantidade = 5
    inicio = 1
    
    model.popular_lista_sequencial(quantidade, inicio)
    lista = model.get_lista_sequencial()
    
    # Verifica o tamanho da lista (de 1 até 4 são 4 elementos)
    assert len(lista) == (quantidade - inicio)
    
    # Verifica se os elementos são exatamente os esperados
    assert lista == [1, 2, 3, 4]
```

## 3. Configurando o VS Code para reconhecer os testes

Para usar a interface visual de testes do VS Code (que é excelente), precisamos instalar o pytest e ativar a extensão nativa de testes.

   1. Instale o Pytest: Abra o terminal do VS Code e digite:
   
```
   pip install pytest
```
   
   2. Ative a Ferramenta de Testes no VS Code:
   
   * Pressione Ctrl + Shift + P (ou Cmd + Shift + P no Mac) para abrir a paleta de comandos.
      * Digite Python: Configure Tests e selecione essa opção.
      * Escolha o framework pytest.
      * Escolha a pasta raiz (. Root directory) como o local onde os testes estão.
   
Após fazer isso, o VS Code criará um painel dedicado a testes no menu lateral esquerdo (um ícone que se parece com um tubo de ensaio de laboratório 🧪).


## 4. Como Executar e Depurar os Testes
Existem duas formas principais de rodar seus testes agora:

* Pelo Painel do VS Code (Visual): Clique no ícone do tubo de ensaio 🧪 no menu lateral. Você verá uma árvore com os seus arquivos de teste. Basta clicar no botão de "Play" ao lado de test_model.py ou de uma função específica. Ficará tudo verde se passar, ou vermelho se falhar.
* Pelo Terminal: Na raiz do projeto, você pode simplesmente digitar o comando:

```
pytest
```

Ele vai varrer seu projeto, encontrar a pasta tests e rodar tudo automaticamente, mostrando um relatório detalhado.

* Dica de ouro com o Debugger: No painel visual de testes (no ícone do tubo de ensaio), se você clicar com o botão direito em cima de qualquer teste e escolher "Debug Test", você pode colocar um breakpoint dentro do seu teste ou dentro do seu model.py para descobrir exatamente por que um teste falhou!

