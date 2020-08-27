#include <iostream>
#include <string>

using namespace std;

int main() {
    cout << "Digite algo: ";
    string algo;
    cin >> algo;

    for (int i = 0; i < algo.length(); i++) {
        cout << algo[i] << endl;
    }

    cout << algo << endl;
    return 1;
}