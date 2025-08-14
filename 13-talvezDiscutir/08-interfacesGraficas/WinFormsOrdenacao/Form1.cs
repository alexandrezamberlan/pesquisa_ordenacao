namespace WinFormsOrdenacao
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button_gerarNumeros_Click(object sender, EventArgs e)
        {
            if (textBox_qtdNumeros.Text.Equals(""))
            {
                MessageBox.Show("Para prosseguir, é preciso informar números", "Alerta" );
            } else
            {
                Random gerador = new Random();
                int numero;
                for (int i = 0; i < int.Parse(textBox_qtdNumeros.Text); i++)
                {
                    numero = gerador.Next(1, 500);
                    lista.Add(numero);
                    textBox_listaNumeros.AppendText(numero.ToString() + Environment.NewLine);
                }
            }
        }
        List<int> lista = new List<int>();

    }
}