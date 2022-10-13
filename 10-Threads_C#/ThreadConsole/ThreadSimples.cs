using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;

namespace ThreadConsole
{
    class ThreadSimples
    {
        private static void Executa()
        {
            Console.WriteLine("Thread secundaria");
            for (int i = 0; i < 10; i++) {
                Console.WriteLine("T Principal: " + i);
                Thread.Sleep(1000);
            }
        }

        public static void Inicia()
        {
            Thread t = new Thread(Executa);
            t.Start();
            Console.WriteLine("Thread principal");
            for (int i = 0; i < 10; i++) {
                Console.WriteLine("T Secundaria: " + i);
                Thread.Sleep(1000);
            }
        }

    }
}
