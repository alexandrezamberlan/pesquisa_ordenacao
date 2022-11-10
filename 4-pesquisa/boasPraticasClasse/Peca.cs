using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace hash
{
    internal class Peca : IComparable 
    {
        public int Codigo { get; set; }
        public int Descricao { get; set; }
        public int Categoria { get; set; }

        public Peca(int codigo, int descricao, int categoria)
        {
            Codigo = codigo;
            Descricao = descricao;
            Categoria = categoria;
        }

        public int CompareTo(object? obj)
        {
            var peca = obj as Peca;

            if (peca != null)
                return this.Codigo.CompareTo(peca.Codigo);
            else
                throw new ArgumentException("Objeto não é Peça");
        }

        public override bool Equals(object? obj)
        {
            var peca = obj as Peca;

            if (peca != null)
            { 
                return this.Codigo.Equals(peca.Codigo);

            } else
            {
                throw new ArgumentException("Objeto não é Peça");
            }
        }

        public override string ToString()
        {
            return "Peca{" + "codigo=" + Codigo + ", descricao=" + Descricao + ", categoria=" + Categoria + '}';
        }

        public override int GetHashCode()
        {
            //int hash = 3;
            //hash = 67 * hash + Codigo;
            //return hash;

            //return HashCode.Combine(Codigo, Descricao);
            //return (Codigo.GetHashCode() ^ Descricao.GetHashCode());

            //return Codigo.GetHashCode();

            return HashCode.Combine(Codigo);
        }
    }
}
