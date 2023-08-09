// SortedSet<int> arvoreInteiros = new SortedSet<int>();
// Random gerador = new Random();

// for (int i = 0; i < 10; i++)
// {
//     arvoreInteiros.Add(gerador.Next(100));
// }

// foreach (var i in arvoreInteiros)
// {
//     Console.WriteLine(i);
// }

// int numero = int.Parse(Console.ReadLine());

// Console.WriteLine(arvoreInteiros.Contains(numero));

SortedSet<Aluno> arvoreAlunos = new SortedSet<Aluno>();
Random gerador = new Random();
int numero;
for (int i = 0; i < 10; i++)
{
    numero = gerador.Next(10);
    if (!arvoreAlunos.Add(new Aluno(numero,"Nome"+numero))) {
        System.Console.WriteLine("Aluno com matrícula já cadastrado");
    }
}

foreach (var i in arvoreAlunos)
{
    Console.WriteLine(i);
}

// int numero = int.Parse(Console.ReadLine());

// Console.WriteLine(arvoreInteiros.Contains(numero));