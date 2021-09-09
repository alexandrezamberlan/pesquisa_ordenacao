#include <iostream>
#include <fstream>
#include <string>
#include <cstdlib>
#include <vector>
#include <locale.h>
#include <time.h>
using namespace std;

vector<int> bolha(vector<int> &vetor) {
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

void exibe(vector<int> &vetor) {
	cout << "Exibindo o vetor ordenado" << endl;
	for (long long int i = 0; i < vetor.size(); i++) {
		cout << vetor[i] << endl;
	}
}


int main() {
	setlocale(LC_ALL,"Portuguese");
	//usando a classe vector - possui métodos de operação o vetor: adicionar, calcular tamanho, retirar, se contém algo, ...
	vector<int> vetor;
	
	//solicita pro usuario nome do arquivo origem
	char nomeArquivo[200];
	cout << "Informe nome do arquivo fonte com números: ";
	cin >> nomeArquivo;
	
	//abrir arquivo para leitura
	//https://www.tutorialspoint.com/cplusplus/cpp_files_streams
	ifstream procuradorArquivo; 
    procuradorArquivo.open(nomeArquivo); 
 
   		
	//le o arquivo capturando os numeros
	int valor;
	
	while (procuradorArquivo >> valor) {
		vetor.push_back(valor); //c++
		//vetor.add(valor) -> java
		//vetor.Add(valor) -> c#
		//vetor.append(valor) -> python
	}
	procuradorArquivo.close();
	cout << "Arquivo lido com sucesso!\n";
	
	clock_t tempoInicio, tempoFim;
	tempoInicio = clock();
    vetor = bolha(vetor);
    tempoFim = clock();
    cout << "Tempo de processamento: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;

	//exibe(vetor);
	return 1;
}
