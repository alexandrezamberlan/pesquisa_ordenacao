using System;
using System.Threading;

namespace ThreadSimples
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Thread Principal: inicia a segunda Thread.");
            // O construtor da classe Thread exige ThreadStart delegado (delegate)
            // que representa o método que será executado na Thread
            // C# simplifica a criação deste delegate.

            Thread t = new Thread(new ThreadStart(ThreadExemplo.ProcessoThread));
            t.Start();

            Thread t2 = new Thread(new ThreadStart(ThreadExemplo.ProcessoThread2));
            t2.Start();

            Thread t3 = new Thread(new ThreadStart(ThreadExemplo.ProcessoThread3));
            t3.Start();

            ThreadExemplo.ProcessoThread2();
        }
    }

    // Cenário de thread simples: iniciar um método estático que roda uma segunda thread.
    class ThreadExemplo
    {
        // método ProcessoThread é chamado quando a thread inicia.
        // repete 10 vezes, escrevendo no console a variável i e segurando (sleep) milisegundos (neste caso, 0)
        public static void ProcessoThread()
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Processo Thread: {0}", i);
                // segura alguns milisegundos, dando a fatia do processo a outra thread.
                Thread.Sleep(1000);
            }
        }

        public static void ProcessoThread2()
        {
            string[] nomes = {"joao", "pedro", "marlon", "cesar", "alexandre", "josi"};
            
            for (int i = 0; i < nomes.Length; i++)
            {
                Console.WriteLine(nomes[i]);
                // segura alguns milisegundos, dando a fatia do processo a outra thread.
                Thread.Sleep(1000);
            }
        }

        public static void ProcessoThread3() 
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Thread Principal: fazendo algo....");
                Thread.Sleep(1000);
            }
        }

    }
}