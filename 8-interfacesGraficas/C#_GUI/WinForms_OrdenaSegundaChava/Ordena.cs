using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WinForms_OrdenaSegundaChava
{
    public class Ordena
    {
        public static void bolha2aChave(List<Dado> lista)
        {
            int i;
            Dado tmp;
            bool houveTroca;

            do
            {
                houveTroca = false;
                for (i = 0; i < lista.Count - 1; i++)
                {
                    if (lista[i].Chave1 > lista[i+1].Chave1)
                    {
                        houveTroca = true;
                        tmp = lista[i];
                        lista[i] = lista[i + 1];
                        lista[i + 1] = tmp;
                    }
                }
            } while (houveTroca);

            do
            {
                houveTroca = false;
                for (i = 0; i < lista.Count - 1; i++)
                {
                    if (lista[i].Chave1 == lista[i + 1].Chave1)
                    {
                        if (lista[i].Chave2 > lista[i + 1].Chave2)
                        {
                            houveTroca = true;
                            tmp = lista[i];
                            lista[i] = lista[i + 1];
                            lista[i + 1] = tmp;
                        }
                    }
                }
            } while (houveTroca);
        }
    }
}
