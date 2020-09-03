using System;
using System.Collections.Generic;

namespace C_
{
    public class Ordenacao
    {
        public static void bolha(List<int> lista) 
        {
            int tmp;
            bool houveTroca;
            int i;
            do 
            {
                houveTroca = false;
                for (i = 0; i < lista.Count-1; i++)
                {
                    if (lista[i] > lista[i+1]) {
                        houveTroca = true;
                        tmp = lista[i];
                        lista[i] = lista[i+1];
                        lista[i+1] = tmp;
                    }
                }
            } while (houveTroca);
        }
    }
}
