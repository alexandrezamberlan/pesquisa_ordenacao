#include <stdio.h>
#include <stdlib.h>
#define TAMANHO_TABELA 30

/*
 * estrutura que representa uma lista duplamente encadeada
 * dado guarda um numero inteiro qualquer
 * ant - guarda o endereco da celula anterior
 * prox - guarda o enedereco da proxima celula
 */
typedef struct nodo {
	int dado;
	struct nodo *ant, *prox;
} CelulaD;

/*
 * metodo que recebe uma tabela hash e o seu tamanho
 * o metodo inicializa cada lista desta tabela hash
 */
void inicializaTabelaHash(CelulaD *tabela[], int n) {
	int i;
	for (i = 0; i < n; i++) {
		tabela[i] = NULL;
	}
}

int main() {
	CelulaD *tabelaHash[TAMANHO_TABELA];

	inicializaTabelaHash(tabelaHash, TAMANHO_TABELA);




	int opcao;

	do {
		printf("1 - Inserir; 2 - Pesquisar; 3 - Exibir; 4 - Sair: ");
		scanf("%d", &opcao);
		switch (opcao) {
			case 1 : //inserir
			         break;
			case 2 : //pesquisar
			         break;
			case 3 : //exibir
			         break;
			case 4 : //vai embora
			         break;
			default : printf("Opcao invalida!\n");
		}
	} while (opcao != 4);

	return 1;
}