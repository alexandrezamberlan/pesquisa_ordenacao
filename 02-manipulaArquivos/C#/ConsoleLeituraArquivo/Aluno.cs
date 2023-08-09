using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleLeituraArquivo
{
    internal class Aluno
    {
        public string Nome { get; set; }
        public int Idade { get; set; }
        public string Email { get; set; }

        public Aluno(string nome, int idade)
        {
            Nome = nome;
            Idade = idade;
            this.gerarEmail();
        }

        private void gerarEmail()
        {
            string[] vetorPalavras = Nome.Split(" ");
            //[joao, victor]
            if (vetorPalavras.Length > 1)
            {
                Email = vetorPalavras[0] + "." + vetorPalavras[1] + "@ufn.edu.br";
            }
            else
            {
                Email = vetorPalavras[0] + "@ufn.edu.br";
            }
        }
        
        public override string? ToString()
        {
            return Nome + " - " + Email;
        }
    }
}
