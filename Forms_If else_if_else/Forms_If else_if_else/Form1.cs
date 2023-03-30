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

namespace Forms_If_else_if_else
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        int number = 10;

        void label1_Click(object sender, EventArgs e)
        {

        }

        void button1_Click(object sender, EventArgs e)
        {
            label1.Text = checkBox1.Checked ? "yes" : "no";
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }
    }
}
        

      
    

        
    
