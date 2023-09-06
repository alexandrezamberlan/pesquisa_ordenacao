using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ColecaoCSharp
{
    public class Aluno : IComparable<Aluno>
    {
        public int Id { get; set; }
        public string Nome { get; set; }

        public Aluno(int id, string nome)
        {
            Id = id;
            Nome = nome;
        }

        public override boolean Equals(Object o) {
            if ((o == null) || !this.GetType().Equals(obj.GetType())) {
                return false;
            } else {
                Aluno e = (Aluno) o;
                return (Id == e.Id && this.Nome == e.Nome);
            }
        }
        

        public int CompareTo(Aluno? other)
        {
            if (this.Id < other.Id)
                return -1;
            if (this.Id == other.Id)
            {
                if (this.Nome.CompareTo(other.Nome) < 0)
                    return -1;
            }
            return 1;
        }        
    }
}
