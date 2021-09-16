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
            List<int> listaSelecao = new List<int>();
            List<int> listaPente = new List<int>();
            
            Console.Write("Quantidade números: ");
            int qtd = Int32.Parse(Console.ReadLine());

            Utilidades.popularLista(listaBolha, qtd);            
            Utilidades.copiarLista(listaBolha, listaSelecao);
            Utilidades.copiarLista(listaBolha, listaPente);
            
            Stopwatch sw = new Stopwatch();

            // sw.Start();
            // Ordenacao.bolha(listaBolha);
            // sw.Stop();
            // Console.WriteLine("Fim do bolha (ms): " + sw.ElapsedMilliseconds);
            // sw.Reset();

            // sw.Start();
            // Ordenacao.selecao(listaSelecao);
            // sw.Stop();
            // Console.WriteLine("Fim do seleção (ms): " + sw.ElapsedMilliseconds);
            // sw.Reset();

            sw.Start();
            Ordenacao.pente(listaPente);
            sw.Stop();
            Console.WriteLine("Fim do pente (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();
        }
    }
}
