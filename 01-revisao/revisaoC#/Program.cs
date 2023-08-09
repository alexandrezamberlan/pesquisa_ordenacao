using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace revisaoC_
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> vetor = new List<int>();
            int quantidade;
            Stopwatch sw = new Stopwatch();

            Console.Write("Quantos números quer gerar? ");
            quantidade = Int32.Parse(Console.ReadLine());
        
            sw.Start();
            popular(vetor, quantidade);
            exibir(vetor);
            sw.Stop();
            Console.WriteLine("Tempo de processamento (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();
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
