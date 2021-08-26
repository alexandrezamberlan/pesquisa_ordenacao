using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace C_
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> listaBolha = new List<int>();
            
            Console.Write("Quantidade números: ");
            int qtd = Int32.Parse(Console.ReadLine());

            Utilidades.popularLista(listaBolha, qtd);
            
            Stopwatch sw = new Stopwatch();

            sw.Start();
            Ordenacao.bolha(listaBolha);
            sw.Stop();
            Console.WriteLine("Fim do bolha (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();
        }
    }
}
