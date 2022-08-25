namespace WinFormsOrdenacao
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.textBox_qtdNumeros = new System.Windows.Forms.TextBox();
            this.button_gerarNumeros = new System.Windows.Forms.Button();
            this.textBox_listaNumeros = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(167, 15);
            this.label1.TabIndex = 0;
            this.label1.Text = "Quantos números quer gerar? ";
            // 
            // textBox_qtdNumeros
            // 
            this.textBox_qtdNumeros.Location = new System.Drawing.Point(185, 6);
            this.textBox_qtdNumeros.Name = "textBox_qtdNumeros";
            this.textBox_qtdNumeros.Size = new System.Drawing.Size(100, 23);
            this.textBox_qtdNumeros.TabIndex = 1;
            // 
            // button_gerarNumeros
            // 
            this.button_gerarNumeros.Location = new System.Drawing.Point(12, 40);
            this.button_gerarNumeros.Name = "button_gerarNumeros";
            this.button_gerarNumeros.Size = new System.Drawing.Size(75, 23);
            this.button_gerarNumeros.TabIndex = 2;
            this.button_gerarNumeros.Text = "Gerar";
            this.button_gerarNumeros.UseVisualStyleBackColor = true;
            this.button_gerarNumeros.Click += new System.EventHandler(this.button_gerarNumeros_Click);
            // 
            // textBox_listaNumeros
            // 
            this.textBox_listaNumeros.Enabled = false;
            this.textBox_listaNumeros.Location = new System.Drawing.Point(12, 79);
            this.textBox_listaNumeros.Multiline = true;
            this.textBox_listaNumeros.Name = "textBox_listaNumeros";
            this.textBox_listaNumeros.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.textBox_listaNumeros.Size = new System.Drawing.Size(90, 140);
            this.textBox_listaNumeros.TabIndex = 3;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(293, 228);
            this.Controls.Add(this.textBox_listaNumeros);
            this.Controls.Add(this.button_gerarNumeros);
            this.Controls.Add(this.textBox_qtdNumeros);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Métodos de Ordenação";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private Label label1;
        private TextBox textBox_qtdNumeros;
        private Button button_gerarNumeros;
        private TextBox textBox_listaNumeros;
    }
}