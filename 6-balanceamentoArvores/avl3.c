#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct nodo {
	int dado;
	int fb; //fator de balanceamento
	struct nodo *esq, *dir;
}Arvore;

int altura(Arvore *r) {
	if (r) {
		int altE = altura(r->esq);
		int altD = altura(r->dir);
		if (altE > altD) {
			return altE + 1;
		} else {
			return altD + 1;
		}
	} else {
		return 0;
	}
}

Arvore* rotarEsq(Arvore *r) {
	Arvore *tmp, *np, *p;

	np = r->dir;
	tmp = np->esq;
	np->esq = r;

	for (p = np->esq; p->dir && p->dir != np; p = p->dir);

	p->dir = tmp;
	return np;
}

Arvore* rotarDir(Arvore *r) {
	Arvore *tmp, *np, *p;

	np = r->esq;
	tmp = np->dir;
	np->dir = r;

	for (p = np->dir; p->esq && p->esq != np; p = p->esq);
	
	p->esq = tmp;
	return np;
}

void recalcularFB(Arvore *r) {
	if (r) {
		r->fb = altura(r->esq) - altura(r->dir);
		recalcularFB(r->esq);
		recalcularFB(r->dir);
	}
}

Arvore *inserir(int valor, Arvore *r) {
	if (r) {
		if (valor < r->dado){
			r->esq = inserir(valor,r->esq);
		}else {
			r->dir = inserir(valor,r->dir);
		}
		//metodo para calcular o fator de balancamento
		r->fb = altura(r->esq) - altura(r->dir);
		if (r->fb == -2) { //Rotacao esquerda
			if (r->dir->fb < 0) {
				//printf("Rotacao esquerda Simples\n");
				r = rotarEsq(r);
				recalcularFB(r);
			} else {
				//rotacao dupla
				//1o no filho
				r->dir = rotarDir(r->dir);
				//2o no filho
				r = rotarEsq(r);
				recalcularFB(r);
			}
		} else if (r->fb == 2) { //Rotacao direita
			if (r->esq->fb > 0)	{
				//printf("Rotacao direita Simples\n");
				r = rotarDir(r);
				recalcularFB(r);
			} else {
				//rotacao dupla
				//1o no filho
				r->esq = rotarEsq(r->esq);
				//2o no filho
				r = rotarDir(r);
				recalcularFB(r);
			}
		}

		return r;

	} else {
		Arvore *novo = (Arvore *)malloc(sizeof(Arvore));
		novo->dado = valor;
		novo->fb = 0;
		novo->esq = NULL;
		novo->dir = NULL;
		return novo;
	}
}

void exibir(Arvore *r,int nivel){
	if (r){
		exibir(r->dir,nivel+1);
		int i;
		for(i=0; i < nivel; i++){
			printf("    ");
		}
		printf("%d(%d)\n", r->dado, r->fb);
		exibir(r->esq, nivel+1);
	}
}

int main() {
	Arvore *raiz = NULL;
	int i;
	srand(time(NULL));
	for (i = 0; i < 100; i++) {
		raiz = inserir(rand() % 40, raiz);
	}

	// raiz = inserir(10, raiz);
	// raiz = inserir(20, raiz);
	// raiz = inserir(30, raiz);
	// raiz = inserir(40, raiz);
	// raiz = inserir(25, raiz);
	// raiz = inserir(37, raiz);
	exibir(raiz,0);

	return 1;
}
