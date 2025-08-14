using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WinForms_OrdenaSegundaChava
{
    public class Dado
    {
        int chave1;
        int chave2;

        public int Chave1 { get => chave1; set => chave1 = value; }
        public int Chave2 { get => chave2; set => chave2 = value; }

        public Dado(int chave1, int chave2)
        {
            this.chave1 = chave1;
            this.chave2 = chave2;
        }
    }
}
