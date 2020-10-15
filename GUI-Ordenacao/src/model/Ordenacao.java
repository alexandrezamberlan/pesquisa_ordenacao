package model;

import java.util.ArrayList;

public class Ordenacao {

    public static void bolha(ArrayList<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int i;

        do {
            houveTroca = false;
            for (i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                }
            }
        } while (houveTroca);
    }

    public static void selecao(ArrayList<Integer> lista) {
        int posMenor, i, j;
        int tmp;

        for (i = 0; i < lista.size() - 1; i++) {
            posMenor = i;
            for (j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) < lista.get(posMenor)) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                tmp = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, tmp);
            }
        }
    }

    public static void insercao(ArrayList<Integer> lista) {
        int i, j, tmp;

        for (i = 1; i < lista.size(); i++) {
            tmp = lista.get(i);
            for (j = i - 1; j >= 0; j--) {
                if (tmp < lista.get(j)) {
                    lista.set(j + 1, lista.get(j));
                } else {
                    break;
                }
            }
            lista.set(j + 1, tmp);
        }
    }

    public static void agitacao(ArrayList<Integer> lista) {
        boolean houveTroca;
        int tmp, ini = 0, fim = lista.size() - 1;
        int i;

        do {
            houveTroca = false;
            for (i = ini; i < fim; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                }
            }
            fim--;

            if (!houveTroca) {
                break;
            }
            houveTroca = false;
            for (i = fim; i > ini; i--) {
                if (lista.get(i) < lista.get(i - 1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i - 1));
                    lista.set(i - 1, tmp);
                }
            }
            ini++;
        } while (houveTroca && ini <= fim);
    }

    public static void pente(ArrayList<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int i;
        int distancia = lista.size();

        do {
            distancia = (int) ((float) distancia / 1.3);
            if (distancia < 1) {
                distancia = 1;
            }

            houveTroca = false;
            for (i = 0; i < lista.size() - distancia; i++) {
                if (lista.get(i) > lista.get(i + distancia)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + distancia));
                    lista.set(i + distancia, tmp);
                }
            }
        } while (distancia > 1 || houveTroca);
    }

    public static void shell(ArrayList<Integer> lista) {
        int i, j, distancia = 1;
        int tmp;
        int referenciaTamanho = 3;

        do {
            distancia = referenciaTamanho * distancia + 1;
        } while (distancia < lista.size());

        do {
            distancia = (int) ((float) distancia / referenciaTamanho);
            for (i = distancia; i < lista.size(); i++) {
                tmp = lista.get(i);
                for (j = i - distancia; j >= 0; j = j - distancia) {
                    if (tmp < lista.get(j)) {
                        lista.set(j + distancia, lista.get(j));
                    } else {
                        break;
                    }
                }
                lista.set(j + distancia, tmp);
            }

        } while (distancia > 1);
    }
    
    
    private static int particiona(ArrayList<Integer> lista, int ini, int fim) {
	int pivo;
        int tmp;

	pivo = ini;
	while (fim > ini) {

		for (; fim > pivo && lista.get(fim) > lista.get(pivo); fim--);

		if (fim > pivo) {
                    tmp = lista.get(pivo);
                    lista.set(pivo, lista.get(fim));
                    lista.set(fim, tmp);	
                    pivo = fim;
		}

		for (ini++; ini < pivo && lista.get(ini) < lista.get(pivo); ini++);

		if (ini < pivo) {
                    tmp = lista.get(pivo);
                    lista.set(pivo, lista.get(ini));
                    lista.set(ini, tmp);
                    pivo = ini;
		}
	}
	return pivo;
}


    public static void quickSort(ArrayList<Integer> lista, int ini, int fim) {
            int pivo;

            pivo = particiona(lista, ini, fim);
            
            if (ini < pivo - 1) quickSort(lista, ini, pivo - 1); //se existe lado esq do pivo, executa lado esq
            if (pivo + 1 < fim) quickSort(lista, pivo + 1, fim); //se existe lado dir do pivo, executa lado dir
    }


}
