#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAMANHO_TABELA 10

/*
 * estrutura que representa uma lista duplamente encadeada
 * dado guarda um nome qualquer
 * ant - guarda o endereco da celula anterior
 * prox - guarda o enedereco da proxima celula
 */
typedef struct nodo {
	char dado[100];
	struct nodo *ant, *prox;
} CelulaD;

/*
 * metodo que recebe um nome e um ponteiro para uma lista duplamente encadeada
 * o metodo insere ordenadamente o valor na lista e a retorna modificada
 */
CelulaD *inserir(char valor[], CelulaD *l) {
	CelulaD *novo;
	CelulaD *pAnterior;

	novo = (CelulaD *)malloc(sizeof(CelulaD));
	strcpy(novo->dado, valor);
	novo->ant = NULL;
	novo->prox = NULL;

	if (!l) return novo;

	while (l->ant) l = l->ant;

	pAnterior = NULL;
	for (; l; l = l->prox) {
		if (strcmp(valor, l->dado) == 0) {
			printf("Dado jah cadastrado\n");
			free(novo);
			return l;
		}
		if (strcmp(valor, l->dado) < 0) {
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

CelulaD *remover(char valor[], CelulaD *l) {
	CelulaD *pAnterior, *lixo;

	if (l) {
		while (l->ant) l = l->ant;

		for (pAnterior = NULL; l; l = l->prox) {
			if (strcmp(valor, l->dado) == 0) { //achei
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
			printf("%s\t", l->dado);
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
int funcaoHash(char chave[]) {
	int i;
	int soma = 0;
	//alex -> 97+108+101+120 -> soma
	//ascii
	for (i = 0; i < strlen(chave); i++) {
		soma = soma + (int)chave[i];
	}
	return soma % TAMANHO_TABELA;
}

void adicionar(char chave[], CelulaD *tabela[]){
	int endereco = funcaoHash(chave);
	
	tabela[endereco] = inserir(chave, tabela[endereco]);
}

void exibirTabelaHash(CelulaD *tabela[], int n) {
	int i;
	for (i = 0; i < n; i++) {
		printf("Endereco %d: ", i);
		exibir(tabela[i]);
	}
}

int main() {
	CelulaD *tabelaHash[TAMANHO_TABELA];
	int i;

	inicializaTabelaHash(tabelaHash, TAMANHO_TABELA);
	
	adicionar("alexandre", tabelaHash);
	adicionar("pedro", tabelaHash);
	adicionar("alex", tabelaHash);
	adicionar("zeni", tabelaHash);
	adicionar("augusto", tabelaHash);
	adicionar("alex", tabelaHash);

	exibirTabelaHash(tabelaHash, TAMANHO_TABELA);

	return 1;
}