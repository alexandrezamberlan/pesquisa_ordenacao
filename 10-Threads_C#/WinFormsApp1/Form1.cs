namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();            
        }
        public delegate void updateUI();
        public void atualizaTextBox()
        {
            textBox.AppendText("Instance thread procedure. " + Data + Environment.NewLine);
        }

        public void DoWork()
        {
            textBox.Invoke(new updateUI(() => { textBox.AppendText(Thread.GetCurrentProcessorId().ToString() + Environment.NewLine); }));
        }

        public int Data { get; set; }
        
        public void DoMoreWork()
        {

            textBox.Invoke(new updateUI(() => { textBox.AppendText("Instance thread procedure. " + Data + Environment.NewLine); }));

        }

        private void button1_Click(object sender, EventArgs e)
        {
            // To start a thread using a static thread procedure, use the
            // class name and method name when you create the ThreadStart
            // delegate. Beginning in version 2.0 of the .NET Framework,
            // it is not necessary to create a delegate explicitly. 
            // Specify the name of the method in the Thread constructor, 
            // and the compiler selects the correct delegate. For example:
            //
            // Thread newThread = new Thread(Work.DoWork);
            //
            ThreadStart threadDelegate = new ThreadStart(this.DoWork);
            Thread newThread = new Thread(threadDelegate);
            newThread.Start();

            // To start a thread using an instance method for the thread 
            // procedure, use the instance variable and method name when 
            // you create the ThreadStart delegate. Beginning in version
            // 2.0 of the .NET Framework, the explicit delegate is not
            // required.
            //

            Data = 42;
            threadDelegate = new ThreadStart(this.DoMoreWork);
            newThread = new Thread(threadDelegate);
            newThread.Start();
        }
    }
}