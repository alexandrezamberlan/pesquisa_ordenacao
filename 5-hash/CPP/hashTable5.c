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
 * metodo que recebe um valor inteiro e um ponteiro para uma lista duplamente encadeada
 * o metodo insere ordenadamente o valor na lista e a retorna modificada
 */
CelulaD *inserir(int valor, CelulaD *l) {
	CelulaD *novo;
	CelulaD *pAnterior;

	novo = (CelulaD *)malloc(sizeof(CelulaD));
	novo->dado = valor;
	novo->ant = NULL;
	novo->prox = NULL;

	if (!l) return novo;

	while (l->ant) l = l->ant;

	pAnterior = NULL;
	for (; l; l = l->prox) {
		if (valor == l->dado) {
			printf("Dado jah cadastrado\n");
			free(novo);
			return l;
		}
		if (valor < l->dado) {
			//insercao aqui
			if (!pAnterior) { //1o elemento
				novo->prox = l;
				l->ant = novo;
				return novo;
			} else { //elemento do meio
				novo->prox = l;
				l->ant = novo;
				break;
			}
		} else pAnterior = l;
	}
	novo->ant = pAnterior;
	pAnterior->prox = novo;
	return novo;
}

CelulaD *remover(int valor, CelulaD *l) {
	CelulaD *pAnterior, *lixo;

	if (l) {
		while (l->ant) l = l->ant;

		for (pAnterior = NULL; l; l = l->prox) {
			if (valor == l->dado) { //achei
				if (!pAnterior) { //1o elemento
					lixo = l;
					l = l->prox;
					if (l) l->ant = NULL;
					free(lixo);
					return l;
				} else if (l->prox) { //elemento do meio
					lixo = l;
					l = l->prox;
					pAnterior->prox = l;
					l->ant = pAnterior;
					free(lixo);
					return pAnterior;
				} else {
					free(l);
					pAnterior->prox = NULL;
					return pAnterior;
				}
			}
			pAnterior = l;
		}
	}
	printf("Valor nao encontrado!!\n");
	return pAnterior;
}

void exibir(CelulaD *l) {
	if (!l) printf("Porcao vazia da tabela\n");
	else {
		while (l->ant) l = l->ant;

		for (; l; l = l->prox) {
			printf("%d\t", l->dado);
		}
		printf("\n");
	}
}


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
	int i;

	inicializaTabelaHash(tabelaHash, TAMANHO_TABELA);

	int opcao;

	do {
		printf("1 - Inserir; 2 - Remover; 3 - Exibir; 4 - Sair: ");
		scanf("%d", &opcao);
		switch (opcao) {
			case 1 : //inserir
			         printf("\nDigite um numero inteiro qualquer: ");
			         scanf("%d", &dado);
			         endereco = abs(funcaoHash(dado));
			         printf("%d sera inserido na posicao %d da tabela\n", dado, endereco);
			         if (tabelaHash[endereco]) printf("Dado em colisao!\n");
			         tabelaHash[endereco] = inserir(dado, tabelaHash[endereco]);
			         break;
			case 2 : //remover
				     printf("\nDigite um numero inteiro qualquer para remocao: ");
			         scanf("%d", &dado);
			         endereco = abs(funcaoHash(dado));
			         if (tabelaHash[endereco]) {
			         	printf("%d sera removido na posicao %d da tabela\n", dado, endereco);
			         	tabelaHash[endereco] = remover(dado, tabelaHash[endereco]);
			         } else printf("Numero nao localizado. Tabela vazia!\n");;
			         break;
			case 3 : //exibir
					 for (i = 0; i < TAMANHO_TABELA; i++) {
					 	printf("Valores da tabela na posicao %d: ", i);
					 	exibir(tabelaHash[i]);
					 }
			         break;
			case 4 : //vai embora
			         break;
			default : printf("Opcao invalida!\n");
		}
	} while (opcao != 4);

	return 1;
}