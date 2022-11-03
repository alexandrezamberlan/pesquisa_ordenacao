using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    internal class Aluno : IComparable<Aluno>
    {

        public int Matricula { get; set; }
        public String Nome { get; set; }

        public Aluno(int matricula, String nome)
        {
            this.Matricula = matricula;
            this.Nome = nome;
        }

        public Aluno(int matricula)
        {
            this.Matricula = matricula;
        }

        public override int GetHashCode()
        {
            int hash = 7;
            hash = 41 * hash + this.Matricula;
            return hash;
        }

        public override bool Equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj == null)
            {
                return false;
            }

            Aluno other = (Aluno)obj;
            if (this.Matricula != other.Matricula)
            {
                return false;
            }
            return true;
        }

        public override String ToString()
        {
            return "Aluno{" + "matricula=" + this.Matricula + ", nome=" + this.Nome + '}';
        }

        public int CompareTo(Aluno a)
        {
            if (this.Matricula == a.Matricula)
            {
                return 0;
            }
            else if (this.Matricula < a.Matricula)
            {
                return -1;
            }
            return 1;
        }
    }
}
