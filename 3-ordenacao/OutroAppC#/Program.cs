using System;
using System.Collections.Generic;

namespace OutroAppC_
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> listaBolha = new List<int>();
            List<int> listaSelecao = new List<int>();
            List<int> listaInsercao = new List<int>();
            List<int> lista = new List<int>();

            Console.Write("Quantidade números: ");
            int qtd = Int32.Parse(Console.ReadLine());

            Utilidades.popularLista(listaBolha, qtd);
            Utilidades.popularLista(listaSelecao, qtd);
            Utilidades.popularLista(listaInsercao, qtd);
            Utilidades.popularLista(lista, qtd);
            
            Console.WriteLine("Inicio do bolha: " + DateTime.Now);
            Ordenacao.bolha(listaBolha);
            Console.WriteLine("Fim do bolha: "+ DateTime.Now);

            Console.WriteLine("Inicio do selecao: " + DateTime.Now);
            Ordenacao.selecao(listaSelecao);
            Console.WriteLine("Fim do selecao: "+ DateTime.Now);

            Console.WriteLine("Inicio do insercao: " + DateTime.Now);
            Ordenacao.insercao(listaInsercao);
            Console.WriteLine("Fim do insercao: "+ DateTime.Now);

            Utilidades.exibirLista(listaInsercao);
        }
    }
}
