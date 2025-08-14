using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;

namespace ThreadConsole
{
    class ThreadComParametro
    {

        class Parametros{
           public int valor;
           public Parametros(int valor){
                this.valor = valor;
           }
        }

        private static void Metodo(Object obj){

            Parametros p = (Parametros)obj;

            for (int i = 0; i < p.valor; i++)
            {
                Console.WriteLine(i + Thread.GetCurrentProcessorId().ToString());
                Thread.Sleep(1000);
            }
        }

        public static void Inicia()
        {
            Thread t = new Thread(Metodo);
            t.Start( new Parametros(10) );

            for (int i = 0; i < 10; i++){
                Console.WriteLine(i + "Thread principal");
                Thread.Sleep(1000);
            }
        }

    }
}
