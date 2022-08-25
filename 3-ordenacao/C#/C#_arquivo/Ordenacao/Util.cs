using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ordenacao
{
    public class Util
    {
        /// <summary>
        /// método static que abre um arquivo plain text e coloca seus valores em uma lista
        /// </summary>
        /// <param name="nomeArquivo">arquivo contendo números inteiros um abaixo do outro</param>
        /// <param name="lista">lista que receberá os números inteiros vindos do arquivo</param>
        public static void popularDoArquivo(string nomeArquivo, List<int> lista)
        {
            StreamReader leitor = new StreamReader(nomeArquivo, Encoding.UTF8); //abre o arquivo para leitura
            int numero;
            do
            {
                numero = int.Parse(leitor.ReadLine());
                lista.Add(numero);
            } while (!leitor.EndOfStream);
            leitor.Close(); //fecha o objeto que representa o arquivo
        }

        public static void exibirLista(string frase, List<int> lista)
        {
            Console.WriteLine(frase);
            foreach (var item in lista)
            {
                Console.WriteLine(item);
            }
        }
    }
}
