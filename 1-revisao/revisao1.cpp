#include <iostream>
using namespace std;
int main() {
    //cout == printf
    cout << "Oi turma\n";

    int idade;
    cout << "Digite sua idade: ";

    //cin == scanf ou gets ou getc
    cin >> idade;

    cout << "Você já dormiu " << (int)idade/3 << " anos da sua vida\n";
    return 1;
}