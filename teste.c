#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void popularVetor(int *v,long long int n){
    long long int i;
    srand(time(NULL));

    for(i = 0; i < n ; i++){
        v[i] = rand() % 1000;
    }

}
void exibirVetor(int *v,long long int n){
    long long int i;

    for(i = 0 ; i < n ; i++){
        printf(" %d \n",v[i]);
    }
}
void OrdenaShell(int *v, long long int n) {
    long long int i , j, dist = 1; //distancia de pesquisa
    int tmp;
    int qtdComparacoes = 1;
    int qtdTrocas = 0;

    clock_t tempoInicio, tempoFim;
    tempoInicio = clock();
    do {
        dist = 3 * dist + 1; //a distancia referencia � o numero 3
    } while(dist < n);

    do {
        dist /= 3;
        for (i = dist; i < n; i++) {
            tmp = v[i];
            qtdComparacoes++;
            for (j = i - dist; j >= 0 && tmp < v[j]; j = j - dist) {
                v[j + dist] = v[j];
                qtdComparacoes++;
                qtdTrocas++;
            }
            v[j + dist] = tmp;
            qtdTrocas++;
        }
    } while (dist > 1);
    tempoFim = clock();

    printf("\nShellsort\nQuantidade Comparacoes: %d\nQuantidade Trocas: %d\n", qtdComparacoes, qtdTrocas);
    printf("Tempo: %f\n", (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC);
}


void ordenaPente(int *v, unsigned long long int n) {
    unsigned long long int i;
	int houveTroca, tmp, distancia = n;

	int qtdComparacoes = 0;
	int qtdTrocas = 0;
    clock_t tempoInicio, tempoFim;

    tempoInicio = clock();
	do {
		distancia /= 1.3;
		if (distancia < 1) distancia = 1;

		houveTroca = 0; //marca que nao houveTroca
		for (i = 0; i + distancia < n; i++) {
			qtdComparacoes++;
			if (v[i] > v[i + distancia]) {
				tmp = v[i];
				v[i] = v[i + distancia];
				v[i + distancia] = tmp;
				houveTroca = 1;
				qtdTrocas++;
			}
		}
	} while (distancia != 1 || houveTroca);
    tempoFim = clock();
	printf("Pente\nQuantidade Comparacoes: %d\nQuantidade Trocas: %d\n", qtdComparacoes, qtdTrocas);
    printf("Tempo: %f\n", (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC);
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

	meio = (ini + fim) / 2;

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

void mergeSort(int v[], unsigned long long int ini, unsigned long long int fim) { //responsavel pela divisao = recursao
    unsigned long long int meio;

    if (ini < fim) {
        meio = (ini + fim) / 2;
        //imprime(v, n); printf(" - n: %d; meio: %d\n", n, meio); getchar();
        
        //printf("%d - %d - %d\n", ini, fim, meio);
        //system("pause");
        if (ini < meio) mergeSort(v, 0, meio); //porcao da esquerda - so entra se existe
        if (meio + 1 < fim) mergeSort(v, meio + 1, fim); //porcao da direita - - so entra se existe

        //printf("chama intercalacao\n"); getchar();
        intercala(v, ini, fim);
    }

}



int main()
{
    long long int quantidade;
    quantidade = 10;
    int vetorShell[quantidade];
    int vetorPente[quantidade];
    int vetorMerge[quantidade];


    //popular vetor
    //popularVetor(vetorShell,quantidade);
    //popularVetor(vetorPente,quantidade);
    popularVetor(vetorMerge,quantidade);
    exibirVetor(vetorMerge,quantidade);
//    printf("------------ORDENADO SHELL----------- \n");
//    OrdenaShell(vetorShell,quantidade);
//    printf("--------PENTE ORDENADO------------ \n");
//    ordenaPente(vetorPente,quantidade);


    clock_t tempoInicio, tempoFim;
    tempoInicio = clock();
    printf("--------MERGE ORDENADO------------ \n");
    mergeSort(vetorMerge,0, quantidade - 1);
    exibirVetor(vetorMerge,quantidade);
    tempoFim = clock();
    printf("Tempo: %f\n", (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC);



    return 0;
}