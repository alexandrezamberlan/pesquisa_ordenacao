#include <iostream>

void bolha(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        houveTroca = false;
        for (i = 0; i < n-1; i++) {
            // qtdComparacoes++;
            if (vetor[i] > vetor[i+1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = tmp;
                // qtdTrocas++;  
            }
        }
    } while (houveTroca);
    // cout << "Quantidade comparações: " << qtdComparacoes << endl;
    // cout << "Quantidade trocas: " << qtdTrocas << endl  << endl;;
}

void selecao(int *vetor, long long int n) {
    long long int posMenor, i, j;
    int tmp;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    for (i = 0; i < n-1; i++) {
        posMenor = i;
        for (j = i + 1; j < n; j++ ) {
            // qtdComparacoes++;
            if (vetor[j] < vetor[posMenor]) {
                posMenor = j;
            }
        }
        if (i != posMenor) { 
            tmp = vetor[i];
            vetor[i] = vetor[posMenor];
            vetor[posMenor] = tmp;
            // qtdTrocas++;
        }
    }
    // cout << "Quantidade comparações: " << qtdComparacoes << endl;
    // cout << "Quantidade trocas: " << qtdTrocas << endl  << endl;;
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
    // cout << "Quantidade comparações: " << qtdComparacoes << endl;
    // cout << "Quantidade trocas: " << qtdTrocas << endl  << endl;;
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

