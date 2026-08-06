# Ideia Principal

Para organizar seu código no padrão MVC (Model-View-Controller), vamos separar as responsabilidades em pastas e pacotes específicos.
    
Mesmo sendo um programa de console simples, essa estrutura ajudará a escalar o projeto no futuro.
    
Estrutura de Pastas e Pacotes

Crie a seguinte estrutura de diretórios na raiz do seu projeto Java (geralmente dentro da pasta src):

```
src/
    └── projeto/
        ├── model/
        │   └── Utilidades.java
        ├── view/
        │   └── ExibicaoView.java
        ├── controller/
        │   └── ListaController.java
        └── Main.java
```

## Camada Model

### (model/Utilidades.java)

Esta camada cuida estritamente da lógica de negócios e manipulação dos dados (gerar números e popular as listas). Ela não sabe como os dados serão exibidos.

```
package projeto.model;

import java.util.List;
import java.util.Random;

public class Utilidades {

    public static void popularLista(List<Integer> lista, long quantidadeNumeros, int inicio, int fim, boolean aleatorio) {
        Random gerador = new Random();
        
        if (aleatorio) {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add(gerador.nextInt(inicio, fim));
            }
        } else {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add((int) (inicio + i));
            }
        }
    }
}
```

## Camada View 

### (view/ExibicaoView.java)

Esta camada é responsável pela interface com o usuário (neste caso, a saída no console). Ela apenas exibe o que recebe e não processa dados.

```
package projeto.view;

import java.util.List;

public class ExibicaoView {

    public static void exibirLista(List<Integer> lista, String frase) {
        System.out.println(frase);
        for (Object item : lista) {
            System.out.println(item);
        }
        System.out.println("--------------------------");
        System.out.println("Total de registros: " + lista.size());
    }

    public static void exibirTempoExecucao(int rotina, long tempoMs) {
        System.out.println("Tempo (ms) rotina " + rotina + ": " + tempoMs);
    }
}
```

## Camada Controller 

### (controller/ListaController.java)

O controlador é o intermediário. Ele dita o fluxo da aplicação: chama o Model para processar os dados, calcula o tempo e envia o resultado para a View exibir.

```
package projeto.controller;

import projeto.model.Utilidades;
import projeto.view.ExibicaoView;

import java.util.ArrayList;
import java.util.List;

public class ListaController {

    public void executarProcessamento() {
        long tempoInicio, tempoFim;  
        List<Integer> listaAleatoria = new ArrayList<>();
        List<Integer> listaSequencial = new ArrayList<>();

        // Rotina 1: Aleatória
        tempoInicio = System.nanoTime();
        Utilidades.popularLista(listaAleatoria, 100000, 100, 100000, true);
        tempoFim = System.nanoTime();
        ExibicaoView.exibirTempoExecucao(1, (tempoFim - tempoInicio) / 1000000);

        // Rotina 2: Sequencial
        tempoInicio = System.nanoTime();
        Utilidades.popularLista(listaSequencial, 100000, 1, 100000, false);
        tempoFim = System.nanoTime();
        ExibicaoView.exibirTempoExecucao(2, (tempoFim - tempoInicio) / 1000000);
        
        // Descomente se quiser exibir as listas:
        // ExibicaoView.exibirLista(listaAleatoria, "Lista Aleatória:");
    }
}
```

## Classe de Entrada 

### (Main.java)

Ponto de partida do programa. Ela apenas instancia o Controller e inicia o sistema.

```
package projeto;

import projeto.controller.ListaController;

public class Main {
    public static void main(String[] args) {
        ListaController controller = new ListaController();
        controller.executarProcessamento();
    }
}
```