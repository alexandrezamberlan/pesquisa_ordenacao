#include <stdio.h>
#include <stdlib.h>


int main() {



	int opcao;

	do {
		printf("1 - Inserir; 2 - Pesquisar; 3 - Exibir; 4 - Sair: ");
		scanf("%d", &opcao);
		switch (opcao) {
			case 1 : //inserir
			         break;
			case 2 : //pesquisar
			         break;
			case 3 : //exibir
			         break;
			case 4 : //vai embora
			default : printf("Opcao invalida!\n");
		}
	} while (opcao != 4);

	return 1;
}