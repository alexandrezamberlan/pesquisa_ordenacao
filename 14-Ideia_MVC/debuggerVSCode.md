# Configurando o launch.json

1. No menu lateral esquerdo do VS Code, clique no ícone de Executar e Depurar (o ícone que parece um "player" de vídeo com um pequeno inseto/besouro 🪲).

2. Clique no link azul que diz "criar um arquivo launch.json" (create a launch.json file).

3. Se o VS Code perguntar o ambiente, selecione Python.

4. Selecione a opção Arquivo Python (Python File).

O VS Code vai criar automaticamente uma pasta oculta chamada .vscode na sua raiz e, dentro dela, um arquivo launch.json.Substitua todo o conteúdo desse arquivo pelo código abaixo:

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "name": "Python: Executar MVC (main.py)",
            "type": "debugpy",
            "request": "launch",
            "program": "${workspaceFolder}/main.py",
            "console": "integratedTerminal",
            "justMyCode": true
        }
    ]
}
```

# Como usar o Debugger

1. Abra qualquer um dos seus arquivos (por exemplo, o controller.py).

2. Adicione um Breakpoint (ponto de parada) clicando bem no lado esquerdo do número de uma linha de código. Uma bolinha vermelha vai aparecer. Dica: coloque uma bolinha na linha self.model.popular_lista_aleatoria(...).

3. Pressione a tecla F5 no seu teclado (ou vá no menu do Debugger e clique no botão verde de "Play").

4. O programa vai iniciar, carregar os pacotes e congelar exatamente na linha onde você colocou a bolinha vermelha.

5. Use a barra flutuante de controles do VS Code para avançar linha por linha (F10 - Step Over) ou entrar dentro do método do Model (F11 - Step Into) para ver a lista sendo gerada!