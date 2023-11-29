using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace _17_WinFormsApp_SerializadorJSON
{
    [Serializable]
    public class Paciente
    {
        string nome;
        DateTime dataNascimento;
        string cpf;

        public Paciente()
        {
        }

        public Paciente(string nome, DateTime dataNascimento, string cpf)
        {
            this.Nome = nome;
            this.DataNascimento = dataNascimento;
            this.Cpf = cpf;
        }

        public string Nome { get => nome; set => nome = value; }
        public DateTime DataNascimento { get => dataNascimento; set => dataNascimento = value; }
        public string Cpf { get => cpf; set => cpf = value; }

        public int CompareTo(object? obj)
        {
            var paciente = obj as Paciente;

            if (paciente != null)
                return this.Nome.CompareTo(paciente.Nome);
            else
                throw new ArgumentException("Objeto não é Paciente");
        }

        public override bool Equals(object? obj)
        {
            var paciente = obj as Paciente;

            if (paciente != null)
            { 
                return this.Nome.Equals(paciente.Nome);

            } else
            {
                throw new ArgumentException("Objeto não é Paciente");
            }
        }

        public override string ToString()
        {
            return "Paciente{" + "Nome=" + Nome + ", Data Nascimento=" + DataNascimento + ", CPF=" + Cpf + '}';
        }
    }
}
