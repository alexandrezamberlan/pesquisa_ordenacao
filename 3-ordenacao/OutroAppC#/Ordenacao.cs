using System;
using System.Collections.Generic;

namespace OutroAppC_
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
    }
}