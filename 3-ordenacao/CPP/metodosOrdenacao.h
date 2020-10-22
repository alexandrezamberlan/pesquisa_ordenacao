#include "utilidades.h"
#include <iostream>

using namespace std; 

void bolha(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        houveTroca = false;
        for (i = 0; i < n-1; i++) {
            qtdComparacoes++;
            if (vetor[i] > vetor[i+1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = tmp;
                qtdTrocas++;  
            }
        }
    } while (houveTroca);
    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
}


Celula *bolhaLista(Celula *l) {
    Celula *i;
    int houveTroca;
    int tmp;

    if (!l) return l;

    do {
        houveTroca = 0;
        for (i = l; i->prox; i = i->prox){
            if (i->dado > i->prox->dado) {
                houveTroca = 1;
                tmp = i->dado;
                i->dado = i->prox->dado;
                i->prox->dado = tmp;
            }
        }
    } while (houveTroca);

    return l;
}

void selecao(int *vetor, long long int n) {
    long long int posMenor, i, j;
    int tmp;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    for (i = 0; i < n-1; i++) {
        posMenor = i;
        for (j = i + 1; j < n; j++ ) {
            qtdComparacoes++;
            if (vetor[j] < vetor[posMenor]) {
                posMenor = j;
            }
        }
        if (i != posMenor) { 
            tmp = vetor[i];
            vetor[i] = vetor[posMenor];
            vetor[posMenor] = tmp;
            qtdTrocas++;
        }
    }
    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
}

Celula *selecaoLista(Celula *l) {
    Celula *posMenor, *i, *j;
    int tmp;

    if (!l) return l;

    for (i = l; i->prox; i = i->prox) {
        posMenor = i;
        for (j = i->prox; j ; j = j->prox) {
            if (j->dado < posMenor->dado) {
                posMenor = j;
            }
        }
        if (i != posMenor) { 
            tmp = i->dado;
            i->dado = posMenor->dado;
            posMenor->dado = tmp;
        }
    }
    return l;
}

void insercao(int *vetor, long long int n) {
    long long int i, j;
    int tmp;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    for (i = 1; i < n; i++) {
        tmp = vetor[i];
        for (j = i - 1; j >= 0; j--) {
            qtdComparacoes++;
            if (tmp < vetor[j]) {
                vetor[j + 1] = vetor[j];
                qtdTrocas++;
            } else break;
        }
        vetor[j + 1] = tmp;
        qtdTrocas++;
    }
    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
}

CelulaD *insercaoLista(CelulaD *l) {
    CelulaD *i, *j;
    int tmp;
    
    if (!l) return l;

    while (l->ant)
        l = l->ant;

    for (i = l->prox; i; i = i->prox) {
        tmp = i->dado;
        for (j = i->ant ; j ; j = j->ant) {
            if (tmp < j->dado) {
                j->prox->dado = j->dado;
            } else break;
        }
        if (!j) l->dado = tmp; //inserindo na primeira posição da lista
        else j->prox->dado = tmp; //inserindo na posição adequada
    }

    return l;
}

void agitacao(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i, ini = 0, fim = n - 1;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        //aplicando o bolha da esquerda para direita
        houveTroca = false;
        for (i = ini; i < fim; i++) {      
            qtdComparacoes++;      
            if (vetor[i] > vetor[i+1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = tmp;
                qtdTrocas++;
            }
        }
        fim--;

        if (!houveTroca) {
            break;
        }

        //aplicando o bolha da direita para esquerda
        houveTroca = false;
        for (i = fim; i > ini; i--) {
            qtdComparacoes++;
            if (vetor[i] < vetor[i-1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i-1];
                vetor[i-1] = tmp;
                qtdTrocas++;
            }
        }
        ini++;

    } while (houveTroca && ini <= fim);

    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
}

CelulaD *agitacaoLista(CelulaD *l) {
    bool houveTroca;
    int tmp;
    CelulaD *i, *ini, *fim;
    if (!l) return l;
    while (l->ant)
        l = l->ant;
    ini = l;
    fim = l;
    while (fim->prox) 
        fim = fim->prox;
    do {
        //aplicando o bolha da esquerda para direita
        houveTroca = false;
        for (i = ini; i->prox != fim; i = i->prox) {      
            if (i->dado > i->prox->dado) {
                houveTroca = true;
                tmp = i->dado;
                i->dado = i->prox->dado;
                i->prox->dado = tmp;
            }
        }
        fim = fim->ant;
        if (!houveTroca) {
            break;
        }
        //aplicando o bolha da direita para esquerda
        houveTroca = false;
        for (i = fim; i->ant != ini; i = i->ant) {
            if (i->dado < i->ant->dado) {
                houveTroca = true;
                tmp = i->dado;
                i->dado = i->ant->dado;
                i->ant->dado = tmp;
            }
        }
        ini = ini->prox;
    } while (houveTroca && fim->prox != ini);

    return l;
}

void pente(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i;
    long long int distancia = n;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        distancia = (int)distancia / 1.3;
        if (distancia < 1) distancia = 1;

        houveTroca = false;
        for (i = 0; i < n - distancia; i++) {
            qtdComparacoes++;
            if (vetor[i] > vetor[i+distancia]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+distancia];
                vetor[i+distancia] = tmp;
                qtdTrocas++;  
            }
        }
    } while (distancia > 1 || houveTroca);
    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
}

void shell(int *vetor, long long int n) {
    long long int i, j, distancia = 1;
    int tmp;
    long long int qtdComparacoes = 0, qtdTrocas = 0;
    int referenciaTamanho = 3;

    do {
        distancia = referenciaTamanho * distancia + 1;
    } while (distancia < n);

    do {
        distancia = (int)distancia / referenciaTamanho;
        
        for (i = distancia; i < n; i++) {
            tmp = vetor[i];
            for (j = i - distancia; j >= 0; j = j - distancia) {
                qtdComparacoes++;
                if (tmp < vetor[j]) {
                    vetor[j + distancia] = vetor[j];
                    qtdTrocas++;
                } else break;
            }
            vetor[j + distancia] = tmp;
            qtdTrocas++;
        }

    } while (distancia > 1);
    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl;
}

long long int particiona(int *vetor, long long int ini, long long int fim) {
    long long int pivo;
    int tmp;

    pivo = ini; //na bibliografia do método, é possível ser o ini, o fim ou uma posição sorteada
    while (fim > ini) {

        for (; fim > pivo && vetor[fim] > vetor[pivo]; fim--);

        if (fim > pivo) {
            tmp = vetor[pivo];
            vetor[pivo] = vetor[fim];
            vetor[fim] = tmp;
            pivo = fim;
        }

        for (ini++; ini < pivo && vetor[ini] < vetor[pivo]; ini++);

        if (ini < pivo) {
            tmp = vetor[pivo];
            vetor[pivo] = vetor[ini];
            vetor[ini] = tmp;
            pivo = ini;
        }
    }
    return pivo;
}

void quickSort(int *vetor, long long int ini, long long int fim) {
    long long int pivo;

    pivo = particiona(vetor, ini, fim);
    
    if (ini < pivo - 1) quickSort(vetor, ini, pivo - 1); //se existe lado esq do pivo, executa lado esq
    if (pivo + 1 < fim) quickSort(vetor, pivo + 1, fim); //se existe lado dir do pivo, executa lado dir
}

void intercala(int v[], unsigned long long int ini, unsigned long long int fim) {
    unsigned long long int meio;
  	unsigned long long int i, j, k;
 	int *vetorTemporario;

  	vetorTemporario = (int*) malloc((fim - ini + 1 ) * sizeof(int));

	if (!vetorTemporario) { //testa para ver se malloc aloca de fato
		printf("Nao hah mais memoria\n");
		exit(1);
	}

	meio = int(ini + fim) / 2;

	i = ini; //indice da porcao esquerda
	j = meio + 1; //indice da porcao direita
	k = 0; //indice do vetor temporario

	while (i <= meio && j <= fim) {
		if (v[i] < v[j]) {
	  		vetorTemporario[k] = v[i]; //elemento da porcao esquerda vem para o temporario
	  		++i;
		} else {
	  		vetorTemporario[k] = v[j]; //elemento da porcao direita vem para o temporario
	  		++j;
		}
		++k;
	}

	if (i == meio+1) {
		while (j <= fim) { //nao hah mais elementos na porcao esquerda
	  		vetorTemporario[k] = v[j];
	  		++j;
	  		++k;
		}
	} else {
		while (i <= meio) {
	    	vetorTemporario[k] = v[i];
	  		++i;
	    	++k;
		}
	}

	for (i = ini, k = 0; i <= fim ; ++i, ++k) {
		v[i] = vetorTemporario[k];
	}

	free(vetorTemporario);
}

void mergeSort(int *vetor, long long int ini, long long int fim) { //responsavel pela divisao = recursao
    long long int meio;

    if (ini < fim) {
        meio = int(ini + fim) / 2;
        //imprime(v, n); printf(" - n: %d; meio: %d\n", n, meio); getchar();
        
        //printf("%d - %d - %d\n", ini, fim, meio);
        //system("pause");
        if (ini < meio) mergeSort(vetor, 0, meio); //porcao da esquerda - so entra se existe
        if (meio + 1 < fim) mergeSort(vetor, meio + 1, fim); //porcao da direita - - so entra se existe

        //printf("chama intercalacao\n"); getchar();
        intercala(vetor, ini, fim);
    }

}
