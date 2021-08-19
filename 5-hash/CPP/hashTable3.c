#include <stdio.h>
#include <stdlib.h>
#define TAMANHO_TABELA 10

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

/*
 * funcao que recebe a chave de um dado e retorne sua posicao na tabela hash
 */
int funcaoHash(int chave) {
	return chave % TAMANHO_TABELA;
}

int main() {
	CelulaD *tabelaHash[TAMANHO_TABELA];
	int dado;
	int endereco;
	int opcao;

	inicializaTabelaHash(tabelaHash, TAMANHO_TABELA);
	do {
		printf("1 - Inserir; 2 - Pesquisar; 3 - Exibir; 4 - Sair: ");
		scanf("%d", &opcao);
		switch (opcao) {
			case 1 : //inserir
			         printf("\nDigite um numero inteiro qualquer: ");
			         scanf("%d", &dado);
			         endereco = funcaoHash(dado);
			         printf("%d sera inserido na posicao %d da tabela\n", dado, endereco);
			         if (tabelaHash[endereco]) printf("Dado em colisao!\n");
			         //tabelaHash[endereco] = inserir(dado, tabelaHash[endereco]);
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