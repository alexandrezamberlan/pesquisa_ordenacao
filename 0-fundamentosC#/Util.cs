using System;
using System.Collections.Generic;

namespace _0_fundamentosC_
{
    class Util
    {
        public static void popular(List<int> lista, int n)
        {
            Random gerador = new Random();
            for (int i = 0; i < n; i++)
            {
                lista.Add(gerador.Next(30));
            }
        }

        public static void exibir(List<int> lista)
        {
            for (int i = 0; i < lista.Count; i++)
            {
                Console.WriteLine(lista[i]);
            }
        }
    }
}