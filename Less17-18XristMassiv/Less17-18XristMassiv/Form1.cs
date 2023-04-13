using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Less17_18XristMassiv
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        async private void button1_Click(object sender, EventArgs e)
        {


            //foreach (CheckBox check in panel1.Controls.OfType<CheckBox>())
            //{
            //    //check.Checked = true;

            //    check.Text = "Я галочный пункт программы";
            //    await Task.Delay(1000);
            //}

            foreach (PictureBox pic in Controls.OfType<PictureBox>())
            {
                pic.BackColor = Color.Lime;
                await Task.Delay(500);
            }


            //char[] chars = "Нам нравиться учиться программированию, потому что все круто идет и получается!".ToCharArray();
            //label1.Text = "";
            //foreach (char ch in chars)
            //{
            //    label1.Text += ch.ToString();
            //    await Task.Delay(100);
            //}
          
            
            //int[] nums =
            //{
            // 1,
            // 2,
            // 3,
            // 4,
            // 5
            //};
            
            // foreach  (int num in nums)
            // {
            //    //await Task.Delay(100);
            //    label1.Text = (num * 5).ToString();
            //    await Task.Delay(100);
            // }
            
            
            //int num1 = 1;
            //int num2 = 2;
            //int num3 = 3;

            //int[] num = { 1, 2, 3 };

            //string[] lines =
            //{
            //    "String 1",
            //    "String 2",
            //    "String 3"
            //};

            //label1.Text = lines[1];



        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void checkBox8_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox9_Click(object sender, EventArgs e)
        {

        }
    }
}
