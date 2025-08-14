using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;

namespace ThreadConsole
{
    class ThreadSimples
    {
        private static void Metodo2()
        {
            Console.WriteLine("Thread secundaria");
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("T secundária: " + i);
                Thread.Sleep(1000);
            }
        }

        private static void Metodo3()
        {
            Console.WriteLine("Thread terciaria");
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("T terciária: " + i);
                Thread.Sleep(1000);
            }
        }

        public static void Inicia()
        {
            Thread t1 = new Thread(Metodo2);
            t1.Start();

            Thread t2 = new Thread(Metodo3);
            t2.Start();

        
            new Thread(() =>
            {
                Console.WriteLine("Thread principal");
                for (int i = 0; i < 10; i++)
                {
                    Console.WriteLine("T Principal: " + i);
                    Thread.Sleep(1000);
                }
            }).Start();

            t1.Abort(); 



        }

    }
}
