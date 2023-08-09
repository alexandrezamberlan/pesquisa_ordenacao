using System;

namespace Arquivo
{
    class Program
    {
        static void Main(string[] args)
        {
            // Util.leArquivo();
            // Util.leArquivoEmLista();
            Console.WriteLine("Manipulando arquivo com números inteiros");
            //Util.leArquivoEmListaInteiros();
            int n;
            Console.Write("Quantos números você quer gerar? ");
            n = Int32.Parse(Console.ReadLine());
            Util.criaArquivoComNumerosInteiros(n);
        }
    }
}
