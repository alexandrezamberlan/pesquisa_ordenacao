using System.Windows.Forms;

namespace WinForms_OrdenaSegundaChava
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button_gerar_Click(object sender, EventArgs e)
        {
            lista.Clear();
            textBox_dados.Clear();
            Random gerador = new Random();
            try
            {
                long qtdNumeros = long.Parse(textBox_qtdDados.Text);
                Dado dado;
                for (; qtdNumeros > 0; qtdNumeros--)
                {
                    dado = new Dado(gerador.Next(0, 100), gerador.Next(0, 500));
                    lista.Add( dado );
                    textBox_dados.AppendText(dado.Chave1 + " - " + dado.Chave2 + Environment.NewLine);
                }
                textBox_qtdDados.Text = "";
                panel_algoritmo.Enabled = true;
            }
            catch (FormatException)
            {
                MessageBox.Show("Tipo inválido", "Alerta");
                textBox_qtdDados.Text = "";
            }
            catch (Exception)
            {

                MessageBox.Show("Confira seus dados no text box", "Alerta");
                textBox_qtdDados.Text = "";
            }
        }    

        private void button_abrirArquivo_Click(object sender, EventArgs e)
        {            
            try
            {
                lista.Clear();
                textBox_dados.Clear();
                OpenFileDialog openFileDialog1;
                openFileDialog1 = new OpenFileDialog();
                openFileDialog1.InitialDirectory = @"C:\";
                openFileDialog1.RestoreDirectory = true;
                openFileDialog1.DefaultExt = "txt";
                openFileDialog1.Title = "Selecione o arquivo fonte com números chave1 e chave2";
                Dado dado;
                openFileDialog1.ShowDialog();                
                string[] linhas = File.ReadAllLines(openFileDialog1.FileName);
                string[] numeros;
                for (int i = 0; i < linhas.Length; i++)
                {
                    numeros = linhas[i].Split(';');
                    dado = new Dado(int.Parse(numeros[0]), int.Parse(numeros[1]));
                    lista.Add(dado);
                    textBox_dados.AppendText(dado.Chave1 + " - " + dado.Chave2 + Environment.NewLine);
                }
                textBox_qtdDados.Text = lista.Count.ToString();
                panel_algoritmo.Enabled = true;
            }
            catch (Exception ex)
            {
                MessageBox.Show("Erro na leitura do arquivo " + ex.Message);
            }
        }

        List<Dado> lista = new List<Dado>();
        
    }
}