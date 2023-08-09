using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleLeituraArquivo
{
    internal class Util
    {
        public static void exibirLista(LinkedList<Aluno> alunos)
        {
            foreach (var item in alunos)
            {
                Console.WriteLine(item);
            }
        }


        public static void lerArquivoPopularLista(LinkedList<Aluno> alunos)
        {
            string nomeArquivo;
            StreamReader leitor;
            string linha;
            string[] vetorLinha;
            Console.Write("Informe caminho e nome do arquivo base: ");
            nomeArquivo = Console.ReadLine();

            //abrir o arquivo
            try
            {
                leitor = new StreamReader(nomeArquivo, Encoding.UTF8); //abre o arquivo para leitura
                do
                {
                    linha = leitor.ReadLine();
                    vetorLinha = linha.Split(";");
                    alunos.AddLast(new Aluno(vetorLinha[0], Int32.Parse(vetorLinha[1])));
                } while (!leitor.EndOfStream);

                leitor.Close();
            }
            catch (Exception)
            {
                Console.WriteLine("Arquivo inexistente ou problema de leitura.. Digite novamente\n");
                lerArquivoPopularLista(alunos);
            }            
        }
    }
}
