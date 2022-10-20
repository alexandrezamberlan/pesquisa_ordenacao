using System;
using System.Collections;
public class Aluno : IComparable{
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

    public override bool Equals(object? obj)
    {        
        if (obj.GetType() == GetType()) 
        {
            Aluno e = (Aluno) obj;
            return this.Matricula == e.Matricula;
        }
        return false; 
    }

    public int CompareTo(object obj) {
        Aluno a = (Aluno)obj;
        if (this.Matricula == a.Matricula) {
            return 0;
        } else if (this.Matricula < a.Matricula) {
            return -1;
        }
        return 1;
    }
}