using System;
using System.Collections.Generic;

namespace revisaoC_
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> vetor = new List<int>();
            int quantidade;
            
            Console.Write("Quantos números quer gerar? ");
            quantidade = Int32.Parse(Console.ReadLine());
        
            popular(vetor, quantidade);
            exibir(vetor);
        }


        static void popular(List<int> v, int n) {
            Random gerador = new Random();
            for (int i = 0; i < n; i++) {
                v.Add(gerador.Next(100));
            }
        }

        static void exibir(List<int> v) {
            for (int i = 0; i < v.Count; i++) {
                Console.WriteLine(v[i]);
            }
        }
    }
}
