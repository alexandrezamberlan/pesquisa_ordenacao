using ColecaoCSharp;

List<Aluno> lista = new List<Aluno>();

lista.Add(new Aluno(45,"Alexandre"));
lista.Add(new Aluno(23, "Pedro"));
lista.Add(new Aluno(19, "Matheus"));
lista.Add(new Aluno(19, "Gabriel"));

lista.Sort();

//lista.Sort((a, b) => a.Id.CompareTo(b.Id));

foreach (var item in lista)
{
    Console.WriteLine(item.Id + "  " + item.Nome);
}



//SortedList<int, string> numberNames = new SortedList<int, string>();
//numberNames.Add(3, "Three");
//numberNames.Add(1, "One");
//numberNames.Add(2, "Two");
//numberNames.Add(4, null);
//numberNames.Add(10, "Ten");
//numberNames.Add(5, "Five");

//foreach (var item in numberNames)
//{
//    Console.WriteLine(item);
//}
