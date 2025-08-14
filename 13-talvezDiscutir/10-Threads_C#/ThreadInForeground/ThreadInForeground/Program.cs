using System;
using System.Diagnostics;
using System.Threading;

namespace ThreadInForeground
{
    class Program
    {
        static void Main(string[] args)
        {
            //observe o tipo de t
            var t = new Thread(ProcessoThread.ExecuteInForeground);
            t.Start();
            Thread.Sleep(1000);
            Console.WriteLine("Thread Principal entrando em execução ({0}) ...", Thread.CurrentThread.ManagedThreadId);
        }
    }


    class ProcessoThread
    {
        public static void ExecuteInForeground()
        {
            DateTime start = DateTime.Now;
            var sw = Stopwatch.StartNew();
            Console.WriteLine("Thread {0}: {1}, Prioridade {2}",
                              Thread.CurrentThread.ManagedThreadId,
                              Thread.CurrentThread.ThreadState,
                              Thread.CurrentThread.Priority);
            do
            {
                Console.WriteLine("Thread {0}: tempo {1:N2} segundos",
                                  Thread.CurrentThread.ManagedThreadId,
                                  sw.ElapsedMilliseconds / 1000.0);
                Thread.Sleep(500);
            } while (sw.ElapsedMilliseconds <= 5000);
            sw.Stop();
        }
    }
}
