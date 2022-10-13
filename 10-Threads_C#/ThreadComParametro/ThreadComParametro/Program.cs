using System;
using System.Diagnostics;
using System.Threading;

namespace ThreadComParametro
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Quantos milissegundos deseja executar? ");
            int quantosMilisegundos = Int32.Parse(Console.ReadLine());

            //observe o tipo de t
            var t = new Thread(ThreadParametrizada.ExecuteInForeground);            
            t.Start(quantosMilisegundos); //observe que a variável indica o valor parametrizado

            Thread.Sleep(1000);
            Console.WriteLine("Thread principal ({0}) criada", Thread.CurrentThread.ManagedThreadId);
        }
    }



    class ThreadParametrizada
    {
        public static void ExecuteInForeground(Object obj)
        {
            int intervalo;
            try
            {
                intervalo = (int)obj;
            }
            catch (InvalidCastException)
            {
                intervalo = 5000;
            }
            DateTime start = DateTime.Now;
            var sw = Stopwatch.StartNew();
            Console.WriteLine("Thread {0}: {1}, Prioridade {2}",
                              Thread.CurrentThread.ManagedThreadId,
                              Thread.CurrentThread.ThreadState,
                              Thread.CurrentThread.Priority);
            do
            {
                Console.WriteLine("Thread {0}: tempo {1:N2} seconds",
                                  Thread.CurrentThread.ManagedThreadId,
                                  sw.ElapsedMilliseconds / 1000.0);
                Thread.Sleep(500);
            } while (sw.ElapsedMilliseconds <= intervalo);
            sw.Stop();
        }
    }
  
}
