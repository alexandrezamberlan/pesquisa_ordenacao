public class Aluno {
    public int Matricula {get;set;}
    public string Nome {get;set;}

    public Aluno(int m, string n) {
        Matricula = m;
        Nome = n;
    }

    public override string ToString()
    {
        return "Nome: " + Nome + ". Matrícula: " + Matricula;
    }

    public override bool Equals(object? o)
    {
        
        if (o.GetType() == GetType()) 
        {
            Aluno e = (Aluno) o;
            return this.Matricula == e.Matricula;
        }
        return false; 
    }
}