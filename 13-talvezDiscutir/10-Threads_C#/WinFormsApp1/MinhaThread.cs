using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System;
using System.Threading;

namespace WinFormsApp1
{
    
    class Work
    {
        public static void DoWork(Object obj)
        {
            System.Windows.Forms.TextBox textBox = new System.Windows.Forms.TextBox();
            textBox =  (System.Windows.Forms.TextBox)obj;
            textBox.AppendText("Método static de thread." + Environment.NewLine);
        }
        public int Data { get; set; }
        public void DoMoreWork(Object obj)
        {
            System.Windows.Forms.TextBox textBox = new System.Windows.Forms.TextBox();
            textBox = (System.Windows.Forms.TextBox)obj;
          
            textBox.AppendText("Instance thread procedure. " + Data + Environment.NewLine);            
        }
    }
}
