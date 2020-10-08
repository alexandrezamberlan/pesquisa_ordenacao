using System;
using System.Collections.Generic;

namespace C_
{
    class Ordenacao
    {
        public static void bolha(List<int> lista)
        {
            int i, tmp;
            bool houveTroca;

            do {
                houveTroca = false;
                for (i = 0; i < lista.Count - 1; i++)
                {
                    if (lista[i] > lista[i+1]) 
                    {
                        houveTroca = true;
                        tmp = lista[i];
                        lista[i] = lista[i+1];
                        lista[i+1] = tmp;
                    }
                }
            } while (houveTroca);
        }        
    

        public static void selecao(List<int> lista)
        {
            int i, j, tmp;
            int posMenor;

            for (i = 0; i < lista.Count - 1; i++) {
                posMenor = i;
                for (j = i + 1; j < lista.Count; j++ ) {
                    if (lista[j] < lista[posMenor]) {
                        posMenor = j;
                    }
                }
            
                if (i != posMenor) { 
                    tmp = lista[i];
                    lista[i] = lista[posMenor];
                    lista[posMenor] = tmp;
                }
            }
        }

        public static void insercao(List<int> lista) {
            int i, j;
            int tmp;

            for (i = 1; i < lista.Count; i++) {
                tmp = lista[i];
                for (j = i - 1; j >= 0; j--) {
                    if (tmp < lista[j]) {
                        lista[j + 1] = lista[j];
                    } else break;
                }
                lista[j + 1] = tmp;
            }
        }

        public static void agitacao(List<int> lista) {
            bool houveTroca;
            int tmp;
            int i, ini = 0, fim = lista.Count - 1;

            do {
                //aplicando o bolha da esquerda para direita
                houveTroca = false;
                for (i = ini; i < fim; i++) {      
                    if (lista[i] > lista[i+1]) {
                        houveTroca = true;
                        tmp = lista[i];
                        lista[i] = lista[i+1];
                        lista[i+1] = tmp;
                    }
                }
                fim--;

                if (!houveTroca) {
                    break;
                }

                //aplicando o bolha da direita para esquerda
                houveTroca = false;
                for (i = fim; i > ini; i--) {
                    if (lista[i] < lista[i-1]) {
                        houveTroca = true;
                        tmp = lista[i];
                        lista[i] = lista[i-1];
                        lista[i-1] = tmp;
                    }
                }
                ini++;

            } while (houveTroca && ini <= fim);
        }

        public static void pente(List<int> lista)
        {
            int i, tmp, distancia = lista.Count;
            bool houveTroca;

            do
            {
                distancia = (int)((float)distancia / 1.3);
                if (distancia < 1) distancia = 1;

                houveTroca = false;
                for (i = 0; i < lista.Count - distancia; i++)
                {
                    if (lista[i] > lista[i + distancia])
                    {
                        houveTroca = true;
                        tmp = lista[i];
                        lista[i] = lista[i + distancia];
                        lista[i + distancia] = tmp;
                    }
                }
            } while (distancia > 1 || houveTroca);
        }

        public static void shell(List<int> lista)
        {
            int i, j, distancia = 1;
            int tmp;
            int referenciaTamanho = 3;
            
            do
            {
                distancia = referenciaTamanho * distancia + 1;
            } while (distancia < lista.Count);

            do
            {
                distancia = (int)((float)distancia / referenciaTamanho);

                for (i = distancia; i < lista.Count; i++)
                {
                    tmp = lista[i];
                    for (j = i - distancia; j >= 0; j = j - distancia)
                    {
                        if (tmp < lista[j])
                        {
                            lista[j + distancia] = lista[j];
                        }
                        else break;
                    }
                    lista[j + distancia] = tmp;
                }

            } while (distancia > 1);
        }
    }
}