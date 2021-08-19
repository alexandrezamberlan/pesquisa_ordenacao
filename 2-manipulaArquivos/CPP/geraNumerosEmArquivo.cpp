#include <iostream>
#include <fstream>
#include <string>
#include <cstdlib>
#include <locale.h>
#include <time.h>
using namespace std;
int main() {
	setlocale(LC_ALL,"Portuguese");
	//solicita pro usuario quantos numeros quer
	long long int qtdNumeros; 
	cout << "Quantos numeros quer gerar? ";
	cin >> qtdNumeros;
	
	//solicita pro usuario nome do arquivo destino
	char nomeArquivo[200];
	cout << "Informe nome do arquivo com extensão: ";
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
		//cout << valor << endl;
		procuradorArquivo << valor << endl;		
	}
	
	procuradorArquivo.close();
	cout << "Arquivo gerado com sucesso!\n";
	return 1;
}
