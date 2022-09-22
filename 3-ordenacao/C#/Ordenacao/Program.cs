﻿using Ordenacao;
using System.Diagnostics;

List<int> listaQuick = new List<int>();
List<int> listaPente = new List<int>();
List<int> lista = new List<int>();

Console.Write("Quantidade números: ");
int qtd = Int32.Parse(Console.ReadLine());

Utilidades.popularLista(listaPente, qtd);
Utilidades.copiarLista(listaPente, listaQuick);
Utilidades.copiarLista(listaPente, lista);

Stopwatch sw = new Stopwatch();

sw.Start();
Ordena.pente(listaPente);
sw.Stop();
Console.WriteLine("Fim do pente (ms): " + sw.ElapsedMilliseconds);
sw.Reset();

sw.Start();
Ordena.quick(listaQuick, 0, listaQuick.Count - 1);
sw.Stop();
Console.WriteLine("Fim do quick (ms): " + sw.ElapsedMilliseconds);
sw.Reset();

sw.Start();
lista.Sort();
sw.Stop();
Console.WriteLine("Fim do sort da MS (ms): " + sw.ElapsedMilliseconds);
sw.Reset();
