#include <iostream>
#include <ctime>
#include "Ordenacao.h"
#include <locale.h>

using namespace std;

int main(int argc, char** argv) {
	setlocale(LC_ALL, "Portuguese");
	vector<int> vetorSelecao;
	vector<int> vetorInsercao;
	vector<int> vetorBolha;
	vector<int> vetorAgitacao;
	vector<int> vetorPente;
	
	clock_t t_inicio;
	long long int qtd = 50000;
	
	Ordenacao::popula(qtd,vetorSelecao);
	Ordenacao::popula(qtd,vetorInsercao);
	Ordenacao::popula(qtd,vetorBolha);
	Ordenacao::popula(qtd,vetorAgitacao);
	Ordenacao::popula(qtd,vetorPente);
	
	cout << "Vetores de " << vetorSelecao.size() << " numeros " <<endl;
	
	t_inicio = clock();
	vetorSelecao = Ordenacao::selecaoVetor(vetorSelecao);
	cout << "Tempo selecao: " << (double)(clock() - t_inicio)/CLOCKS_PER_SEC << endl;
	
	t_inicio = clock();
	vetorInsercao = Ordenacao::insercaoVetor(vetorInsercao);
	cout << "Tempo insercao: " << (double)(clock() - t_inicio)/CLOCKS_PER_SEC << endl;
	
	t_inicio = clock();
	vetorBolha = Ordenacao::bolhaVetor(vetorBolha);
	cout << "Tempo bolha: " <<  (double)(clock() - t_inicio)/CLOCKS_PER_SEC << endl;
	
	t_inicio = clock();
	vetorAgitacao = Ordenacao::agitacaoVetor(vetorAgitacao);
	cout << "Tempo agitacao: " <<  (double)(clock() - t_inicio)/CLOCKS_PER_SEC << endl;
	
	t_inicio = clock();
	vetorPente = Ordenacao::penteVetor(vetorPente);
	cout << "Tempo pente: " <<  (double)(clock() - t_inicio)/CLOCKS_PER_SEC << endl;
	//Ordenacao::exibeVetor(vetorPente);

	return 0;
}
