using System;
using System.Collections.Generic;

namespace C_
{
    class Program
    {
        static void popularLista(List<int> lista, int n) 
        {
            for (int i = 0; i < n; i++)
            {
                Random gerador = new Random();
                lista.Add(gerador.Next(100));
            }
        }

        static void exibirLista(List<int> lista) 
        {
            for (int i = 0; i < lista.Count; i++)
            {
                Console.WriteLine(lista[i]);
            }
        }
        static void Main(string[] args)
        {
            List<int> lista = new List<int>();
            popularLista(lista,20000);

            Console.WriteLine(DateTime.Now);
            Ordenacao.bolha(lista);
            Console.WriteLine(DateTime.Now);
            //exibirLista(lista);
        }
    }
}
