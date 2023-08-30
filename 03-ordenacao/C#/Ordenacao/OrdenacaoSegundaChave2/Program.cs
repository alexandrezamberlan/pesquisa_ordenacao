using OrdenacaoSegundaChave2;

List<Pessoa> lista = new List<Pessoa>();

//clay    rian	alex	pedro	ana	sofia	alex	alex
//18	    17	    17	    20	    18	15	    48	    18

lista.Add(new Pessoa("clay", 18));
lista.Add(new Pessoa("rian", 17));
lista.Add(new Pessoa("alex", 17));
lista.Add(new Pessoa("pedro", 20));
lista.Add(new Pessoa("ana", 18));
lista.Add(new Pessoa("sofia", 15));
lista.Add(new Pessoa("alex", 48));
lista.Add(new Pessoa("alex", 18));

//primeiro criterio de ordenacao é a idade, segundo, o nome
//lista.Sort(delegate (Pessoa p1, Pessoa p2) {
//    int resposta = p1.Idade.CompareTo(p2.Idade);
//    if (resposta != 0)
//    {
//        return resposta;
//    }
//    return p1.Nome.CompareTo(p2.Nome);
//});

//primeiro criterio de ordenacao é o nome, segundo, a idade
lista.Sort(delegate (Pessoa p1, Pessoa p2) {
    int resposta = p1.Nome.CompareTo(p2.Nome); 
    if (resposta != 0)
    {
        return resposta;
    }
    return p1.Idade.CompareTo(p2.Idade);
});

foreach (var item in lista)
{
    Console.WriteLine(item);
}

