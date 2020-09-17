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
            List<int> listaInsercao = new List<int>();
            List<int> listaAgitacao = new List<int>();
            List<int> lista = new List<int>();

            Console.Write("Quantidade números: ");
            int qtd = Int32.Parse(Console.ReadLine());

            Utilidades.popularLista(listaBolha, qtd);
            Utilidades.popularLista(listaSelecao, qtd);
            Utilidades.popularLista(listaInsercao, qtd);
            Utilidades.popularLista(listaAgitacao, qtd);
            Utilidades.popularLista(lista, qtd);
            
            Stopwatch sw = new Stopwatch();

            sw.Start();
            Ordenacao.bolha(listaBolha);
            sw.Stop();
            Console.WriteLine("Fim do bolha (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();

            sw.Start();
            Ordenacao.selecao(listaSelecao);
            sw.Stop();
            Console.WriteLine("Fim do selecao (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();

            sw.Start();
            Ordenacao.insercao(listaInsercao);
            sw.Stop();
            Console.WriteLine("Fim do insercao (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();

            sw.Start();
            Ordenacao.agitacao(listaAgitacao);
            sw.Stop();
            Console.WriteLine("Fim do agitação (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();

            // Console.WriteLine("Inicio do método de ordenação do C#: " + DateTime.Now);
            // //(lista);
            // Console.WriteLine("Fim do método de ordenação do C#: "+ DateTime.Now);
            // Utilidades.exibirLista(lista);
        }
    }
}
