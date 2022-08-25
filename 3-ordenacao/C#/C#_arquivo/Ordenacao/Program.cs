using Ordenacao;
using System.Diagnostics;

List<int> listaSelecao = new List<int>();
List<int> listaInsercao = new List<int>();
List<int> listaBolha = new List<int>();
List<int> listaAgitacao = new List<int>();
List<int> listaPente = new List<int>();


string nomeArquivo;
Console.WriteLine("Informe caminho e nome de arquivo a ser utilizado: ");
nomeArquivo = Console.ReadLine();

Util.popularDoArquivo(nomeArquivo, listaSelecao);
//Util.exibirLista("Selecao",listaSelecao);
listaInsercao.AddRange(listaSelecao);
listaBolha.AddRange(listaSelecao);
listaAgitacao.AddRange(listaSelecao);
listaPente.AddRange(listaSelecao);


Stopwatch sw = new Stopwatch();

sw.Start();
Ordena.bolha(listaBolha);
sw.Stop();
Console.WriteLine("Fim do bolha (ms): " + sw.ElapsedMilliseconds);
sw.Reset();

sw.Start();
Ordena.selecao(listaSelecao);
sw.Stop();
Console.WriteLine("Fim do seleção (ms): " + sw.ElapsedMilliseconds);
sw.Reset();

sw.Start();
Ordena.insercao(listaInsercao);
sw.Stop();
Console.WriteLine("Fim do insercao (ms): " + sw.ElapsedMilliseconds);
sw.Reset();

sw.Start();
Ordena.agitacao(listaAgitacao);
sw.Stop();
Console.WriteLine("Fim do agitacao (ms): " + sw.ElapsedMilliseconds);
sw.Reset();

sw.Start();
Ordena.pente(listaPente);
sw.Stop();
Console.WriteLine("Fim do pente (ms): " + sw.ElapsedMilliseconds);
sw.Reset();




