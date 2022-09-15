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

void intercala(int v[], unsigned long long int n) {
  	unsigned long long int meio;
  	unsigned long long int i, j, k;
 	int *vetorTemporario;

  	vetorTemporario = (int*) malloc(n * sizeof(int));

	if (!vetorTemporario) { //testa para ver se malloc aloca de fato
		printf("Nao hah mais memoria\n");
		exit(1);
	}

	meio = n / 2;

	i = 0; //indice da porcao esquerda
	j = meio; //indice da porcao direita
	k = 0; //indice do vetor temporario

	while (i < meio && j < n) {

		if (v[i] < v[j]) {
	  		vetorTemporario[k] = v[i]; //elemento da porcao esquerda vem para o temporario
	  		++i;
		} else {
	  		vetorTemporario[k] = v[j]; //elemento da porcao direita vem para o temporario
	  		++j;
		}
		++k;
	}

	if (i == meio) {
		while (j < n) { //nao hah mais elementos na porcao esquerda
	  		vetorTemporario[k] = v[j];
	  		++j;
	  		++k;

		}
	} else {
		while (i < meio) {
	    	vetorTemporario[k] = v[i];
	  		++i;
	    	++k;

		}
	}

	for (i = 0; i < n; ++i) {
		v[i] = vetorTemporario[i];

	}

	free(vetorTemporario);
}

void mergeSort(int v[], unsigned long long int n) { //responsavel pela divisao = recursao
  unsigned long long int meio;

  if (n > 1) {
    meio = n / 2;
    //imprime(v, n); printf(" - n: %d; meio: %d\n", n, meio); getchar();

    mergeSort(v, meio); //porcao da esquerda
    mergeSort(v + meio, n - meio); //porcao da direita
    //printf("chama intercalacao\n"); getchar();
    intercala(v, n);
  }
}




int main()
{
    long long int quantidade;
    quantidade = 100000;
    int vetorMerge[quantidade];

    popularVetor(vetorMerge,quantidade);
    //exibirVetor(vetorMerge,quantidade);

    clock_t tempoInicio, tempoFim;
    tempoInicio = clock();
    printf("--------MERGE ORDENADO------------ \n");
    mergeSort(vetorMerge, quantidade);
    // exibirVetor(vetorMerge,quantidade);
    tempoFim = clock();
    printf("Tempo: %f\n", (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC);

	//exibirVetor(vetorMerge,quantidade);

    return 0;
}