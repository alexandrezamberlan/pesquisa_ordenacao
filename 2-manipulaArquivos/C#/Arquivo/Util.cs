using System;
using System.Collections.Generic; //importação para manipular List
using System.IO; //importação para manipular arquivos
using System.Text; //importação para manipular o Encoding de um texto
namespace Arquivo
{
    class Util
    {
        public static void leArquivo()
        {
            try
            {
                String nomeArquivo;
                String texto;

                Console.Write("Digite o nome do arquivo que deseja ler: ");
                nomeArquivo = Console.ReadLine();
                StreamReader leitor = new StreamReader(nomeArquivo, Encoding.UTF8); //abre o arquivo para leitura

                texto = leitor.ReadToEnd(); //le um arquivo todo do início ao fim e armazena em texto
                Console.WriteLine(texto);
                leitor.Close(); //fecha o objeto que representa o arquivo
            }
            catch (IOException e)
            {
                Console.WriteLine("Erro ao ler o arquivo: " + e.Message);
                Util.leArquivo(); //ponto de recursão - USAR COM CUIDADO
            }
        }

        public static void leArquivoEmLista()
        {
            try
            {
                List<String> frasesLidas = new List<string>();
                String nomeArquivo;
                Console.Write("Digite o nome do arquivo que deseja ler: ");
                nomeArquivo = Console.ReadLine();
                StreamReader leitor = new StreamReader(nomeArquivo, Encoding.UTF8); //abre o arquivo para leitura

                do
                {
                    frasesLidas.Add(leitor.ReadLine());
                } while (!leitor.EndOfStream);
                leitor.Close(); //fecha o objeto que representa o arquivo

                for (int i = 0; i < frasesLidas.Count; i++)
                {
                    Console.WriteLine(frasesLidas[i]);
                }
            }
            catch (IOException e)
            {
                Console.WriteLine("Erro ao ler o arquivo: " + e.Message);
                Util.leArquivoEmLista();
            }
        }

        public static void leArquivoEmListaInteiros()
        {
            try
            {
                List<Int32> listaNumeros = new List<Int32>();
                String nomeArquivo;
                Console.Write("Digite o nome do arquivo que deseja ler: ");
                nomeArquivo = Console.ReadLine();
                StreamReader leitor = new StreamReader(nomeArquivo, Encoding.UTF8); //abre o arquivo para leitura

                do
                {
                    listaNumeros.Add(Int32.Parse(leitor.ReadLine()));
                } while (!leitor.EndOfStream);
                leitor.Close(); //fecha o objeto que representa o arquivo

                for (int i = 0; i < listaNumeros.Count; i++)
                {
                    Console.WriteLine(listaNumeros[i]);
                }
            }
            catch (IOException e)
            {
                Console.WriteLine("Erro ao ler o arquivo: " + e.Message);
                Util.leArquivoEmLista();
            }
        }

        public static void criaArquivoComNumerosInteiros(int quantidade) 
        {
            try
            {
                String nomeArquivo;
                StreamWriter escritor;

                Console.Write("Digite o nome do arquivo que deseja gravar com os números: ");
                nomeArquivo = Console.ReadLine();
                escritor = new StreamWriter(nomeArquivo); //abre o arquivo para escrita

                Random gerador = new Random();
                for (int i = 0; i < quantidade; i++) 
                {
                    escritor.WriteLine(gerador.Next(1000)); //literalmente escreve no arquivo
                    escritor.Flush(); //garante depois de cada numero gerado que vá para o arquivo
                }
                escritor.Close(); //fecha o objeto que representa o arquivo
            }
            catch (IOException e)
            {
                Console.WriteLine("Erro ao gravar o arquivo: " + e.Message);
                Util.criaArquivoComNumerosInteiros(quantidade); //ponto de recursão - USAR COM CUIDADO
            }

        }

        public static void escreveNoArquivo()
        {
            try
            {
                String frase;
                String nomeArquivo;
                StreamWriter escritor;

                Console.Write("Digite o nome do arquivo que deseja gravar: ");
                nomeArquivo = Console.ReadLine();
                escritor = new StreamWriter(nomeArquivo); //abre o arquivo para escrita

                do
                {
                    Console.Write("Digite uma frase ou 'sair' para encerrar programa: ");
                    frase = Console.ReadLine();
                    frase.ToLower(); //frase.toUpper();
                    if (frase.Equals("sair"))
                    {
                        break;
                    }
                    escritor.WriteLine(frase); //literalmente escreve no arquivo
                    escritor.Flush(); //garante depois de cada frase digitada que vá para o arquivo

                } while (true);
                escritor.Close(); //fecha o objeto que representa o arquivo
            }
            catch (IOException e)
            {
                Console.WriteLine("Erro ao gravar o arquivo: " + e.Message);
                Util.escreveNoArquivo(); //ponto de recursão - USAR COM CUIDADO
            }
        }
    }
}
