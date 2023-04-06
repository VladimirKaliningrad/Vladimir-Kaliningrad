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

namespace Lessons13_try_catch_finally
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                Directory.Delete(@"C:\Users\User\Desktop\222");
            }
            catch (Exception ex)
            {
                Clipboard.Clear();
                Clipboard.SetText(ex.ToString());
            }


            //throw new Exception("Ты такой кривой!");
        }
    }
}
