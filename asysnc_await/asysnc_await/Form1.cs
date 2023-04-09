using System;
using System.IO;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace asysnc_await
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        void button1_Click(object sender, EventArgs e)
        {
            Method();
            
        }
        int i = 0;

        async void Method()
        {
            while (button1.Location.X<500)
            {
                button1.Location = new Point(button1.Location.X + 1, button1.Location.Y); ;
                await Task.Delay(2);
                label1.Text = i.ToString();

            }
        }



        //async void Method()
        //{
        //    while (progressBar1.Value != 100)
        //    {
        //        progressBar1.Value++;
        //        await Task.Delay(100);

        //    }
            
        //} 



        //async void Method()
        //{
        //    await Task.Run(() =>
        //    {

        //        while (File.Exists(@"C:\Users\User\Desktop\111.docx"))
        //        {

        //        }
        //        Close();
        //    });

        //    //await Task.Run(() => { });


        //}
    }
}
