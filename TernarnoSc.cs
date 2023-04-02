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

namespace Method
{
    public partial class Form1 : Form
    {
        
        public Form1()
        {
            InitializeComponent();
        }
        string file = @"C:\Users\User\Desktop\1111.docx";
        private void Button1_Click(object sender, EventArgs e)
        {
            //if (Look(file) == true)
            //{
            //  label1.Text = Say(file, null);
            //}
            //else
            //{
            //    label1.Text = Say(file, "no");
            //}

            label1.Text = Look(file) ? Say(file, null) : Say(file, "no");
        }
        bool Look(string line)
        {
        //    if (File.Exists(line))
        //    {
        //        return true;
        //    }
        //    else
        //    {
        //        return false;
        //    }
            return File.Exists(line) ? true : false;
        }
        string Say(string line,string line2 )
        {
            return $"File\n {line}\n {line2} exists";
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
