#include <vector>
#include <iostream>
#include <fstream>
#include <string>
#include <cstdlib>
#include <cstdlib>
#include <time.h>

using namespace std;

class Ordenacao { 
public:
  static void geraNumerosEmArquivo();
  static vector<int> leNumerosDeArquivo();
  static vector<int> popula(long long int qtd, vector<int> &vetor);
  static void exibeVetor(const vector<int> &vetor);
  static vector<int> selecaoVetor(vector<int> &vetor);
  static vector<int> insercaoVetor(vector<int> &vetor);
  static vector<int> bolhaVetor(vector<int> &vetor);
  static vector<int> agitacaoVetor(vector<int> &vetor);
  static vector<int> penteVetor(vector<int> &vetor);
};