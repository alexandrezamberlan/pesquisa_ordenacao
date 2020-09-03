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
            Ordenacao.bolha(lista);
            Util.exibir(lista);
        }
    }
}
