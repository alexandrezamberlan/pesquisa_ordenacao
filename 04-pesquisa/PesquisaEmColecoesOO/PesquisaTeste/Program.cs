List<Aluno> lista = new List<Aluno>();

for (int i = 1; i < 10; i++) {
    lista.Add(new Aluno(i,"Nome"+i));
}

foreach (var item in lista)
{
    Console.WriteLine(item);
}

Aluno alunoPesquisa = new Aluno(1,"Nomex");
Console.WriteLine(lista.IndexOf(alunoPesquisa));
