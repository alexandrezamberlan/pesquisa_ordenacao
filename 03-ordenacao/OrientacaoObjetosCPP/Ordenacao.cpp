#include "Ordenacao.h"

void Ordenacao::geraNumerosEmArquivo() {
	long long int qtdNumeros; 
	cout << "Quantos numeros quer gerar? ";
	cin >> qtdNumeros;
	
	//solicita pro usuario nome do arquivo destino
	char nomeArquivo[200];
	cout << "Informe nome do arquivo com extens�o: ";
	cin >> nomeArquivo;
	
	//criar um arquivo para escrita
	//https://www.tutorialspoint.com/cplusplus/cpp_files_streams
	ofstream procuradorArquivo;
	procuradorArquivo.open(nomeArquivo);
	
	//popula no arquivo a qtd de numeros sorteados
	srand(time(NULL));
	int valor;
	for (; qtdNumeros > 0; qtdNumeros--) {
		valor = rand() % 10000;
		procuradorArquivo << valor << "\n";		
	}
	
	procuradorArquivo.close();
	cout << "Arquivo gerado com sucesso!\n";
}

vector<int> Ordenacao::leNumerosDeArquivo() {	
	vector<int> vetor;
	//solicita pro usuario nome do arquivo origem
	char nomeArquivo[200];
	cout << "Informe nome do arquivo fonte com n�meros: ";
	cin >> nomeArquivo;
	
	//abrir arquivo para leitura
	//https://www.tutorialspoint.com/cplusplus/cpp_files_streams
	ifstream procuradorArquivo; 
    procuradorArquivo.open(nomeArquivo); 
 
	//le o arquivo capturando os numeros
	int valor;
	
	while (procuradorArquivo >> valor) {
		vetor.push_back(valor);
	}
	procuradorArquivo.close();
	cout << "Arquivo lido com sucesso!\n";
	return vetor;
}

vector<int> Ordenacao::popula(long long int qtd, vector<int> &vetor){
	srand(time(NULL));
	for (; qtd > 0; qtd--) {
		vetor.push_back(rand() % 1000);
	}
	return vetor;
}

void Ordenacao::exibeVetor(const vector<int> &vetor) {
	long long int i;
	for (i = 0; i < vetor.size(); i++) {
		cout << vetor[i] << endl;
	}
}

vector<int> Ordenacao::selecaoVetor(vector<int> &vetor) {
	long long int i, j, posMenor;
	int aux;
	
	for (i = 0; i < vetor.size() - 1; i++) {
		posMenor = i;
		for (j = i + 1; j < vetor.size(); j++) {
			if (vetor[j] < vetor[posMenor]) {
				posMenor = j;
			}
		}
		if (i != posMenor) {
			aux = vetor[i];
			vetor[i] = vetor[posMenor];
			vetor[posMenor] = aux;
		}
	}
	return vetor;	
}

vector<int> Ordenacao::insercaoVetor(vector<int> &vetor) {
	long long int i,j;
	int aux;
	
	for (i = 1; i < vetor.size(); i++) {
		aux = vetor[i];
		for (j = i - 1; j >= 0 && aux < vetor[j] ; j--) {
			vetor[j+1] = vetor[j];
		}
		vetor[j+1] = aux;
	}
	return vetor;	
}

vector<int> Ordenacao::bolhaVetor(vector<int> &vetor) {
	long long int i;
	int aux, houveTroca;
	
	do {
		houveTroca = 0;
		for (i = 0; i < vetor.size() - 1; i++) {
			if (vetor[i] > vetor[i+1]) {
				aux = vetor[i];
				vetor[i] = vetor[i+1];
				vetor[i+1] = aux;
				houveTroca = 1;
			}
		}
	} while (houveTroca);	
	return vetor;	
}

vector<int> Ordenacao::agitacaoVetor(vector<int> &vetor) {
	long long int i, ini = 0, fim = vetor.size() - 1;
	int aux, houveTroca;
	
	do {
		houveTroca = 0;
		for (i = ini; i < fim; i++) {
			if (vetor[i] > vetor[i+1]) {
				aux = vetor[i];
				vetor[i] = vetor[i+1];
				vetor[i+1] = aux;
				houveTroca = 1;
			}
		}
		fim--;
		if (!houveTroca) break;
		
		houveTroca = 0;
		for (i = fim; i > ini; i--) {
			if (vetor[i] < vetor[i-1]) {
				aux = vetor[i];
				vetor[i] = vetor[i-1];
				vetor[i-1] = aux;
				houveTroca = 1;
			}
		}
		ini++;
		
	} while (houveTroca && ini < fim);
	return vetor;	
}

vector<int> Ordenacao::penteVetor(vector<int> &vetor) {
	long long int i, distancia = vetor.size();
	int aux, houveTroca;
	do {
		distancia = (int)distancia / 1.3;
		if (distancia < 1) distancia = 1; //significa que virou bolha
		houveTroca = 0;
		for (i = 0; i + distancia < vetor.size(); i++) {
			if (vetor[i] > vetor[i + distancia]) {
				aux = vetor[i];
				vetor[i] = vetor[i + distancia];
				vetor[i + distancia] = aux;
				houveTroca = 1;
			}
		}
	} while (distancia > 1 || houveTroca);
	return vetor;
}

















