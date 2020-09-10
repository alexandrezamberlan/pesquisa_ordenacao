using System;
using System.Collections.Generic;

namespace _0_fundamentosC_
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> lista = new List<int>();
            Util.popular(lista, 10);
            Console.WriteLine(DateTime.Now);
            Ordenacao.bolha(lista);
            Console.WriteLine(DateTime.Now);
            Util.exibir(lista);
        }
    }
}
