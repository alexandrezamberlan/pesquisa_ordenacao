using System;
using System.IO;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void abrirArquivo(object sender, EventArgs e)
    {
        //textview_texto.Buffer.Text += "Entrou um texto aqui\n";
        Gtk.FileChooserDialog filechooser =
        new Gtk.FileChooserDialog("Choose the file to open",
            this,
            FileChooserAction.Open,
            "Cancel", ResponseType.Cancel,
            "Open", ResponseType.Accept);

        if (filechooser.Run() == (int)ResponseType.Accept)
        {
            System.IO.FileStream file = System.IO.File.OpenRead(filechooser.Filename);
            StreamReader leitor = new StreamReader(file);
            String linha;
            textview_texto.Buffer.Text = "";
            while ((linha = leitor.ReadLine()) != null)
            {
                linha += "\n";
                textview_texto.Buffer.Text += linha;
            }
          
            file.Close();
        }

        filechooser.Destroy();

    }

    protected void pesquisarTexto(object o, KeyReleaseEventArgs args)
    {
        //Console.WriteLine(textview_pesquisar.Buffer.Text);
        int ocorrencias = 0;
        for (int k = 1; k <= textview_texto.Buffer.Text.Length; ++k)
        {
            // a[1..m] casa com b[k-m+1..k]?
            int i = textview_pesquisar.Buffer.Text.Length;
            int j = k;
            while (i >= 1 && textview_pesquisar.Buffer.Text[i] == textview_texto.Buffer.Text[j])
            {
                --i;
                --j;
            }

            if (i < 1) ++ocorrencias;

        }
        textview_ocorrencias.Buffer.Text = "" + ocorrencias;
    }
}
