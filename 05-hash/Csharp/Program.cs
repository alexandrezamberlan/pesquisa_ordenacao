using Csharp;
using System.Collections.Generic;
HashSet<Aluno> tabelaHash = new HashSet<Aluno>();
string nome;
int matricula;
Aluno aluno;
while (true)
{
    Console.Write("Nome: ");
    nome = Console.ReadLine();
    
    if (nome.Equals("sair"))
    {
        break;
    }
    try
    {
        Console.Write("Matrícula: ");
        matricula = int.Parse(Console.ReadLine());
        aluno = new Aluno(matricula, nome);

        if (tabelaHash.Add(aluno))
        {
            Console.WriteLine("Inserção com sucesso");
        }
        else
        {
            Console.WriteLine("Aluno já existente");
        }
    }
    catch (Exception e)
    {
        continue;
    }
}


foreach (var item in tabelaHash)
{
    Console.WriteLine(item);
}


Console.Write("Matrícula de pesquisa: ");

int m = int.Parse(Console.ReadLine());

Aluno aPesquisa = new Aluno(m);


if (tabelaHash.Contains(aPesquisa))
{
    Console.WriteLine("Encontrado");
}


