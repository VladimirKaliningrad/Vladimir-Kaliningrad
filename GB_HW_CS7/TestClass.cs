using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharp_course_Lesson_and_DZ_7
{
    [AttributeUsage(AttributeTargets.Property, AllowMultiple = false)]
    public class CustomNameAttribute : Attribute
    {
        public string CustomFieldName { get; }

        public CustomNameAttribute(string customFieldName)
        {
            CustomFieldName = customFieldName;
        }
    }



    internal class TestClass
    {
        [CustomName("CustomFieldName")]
        public int I { get; set; }
        [CustomName("CustomFieldName")]
        public int II { get; set; }
        [CustomName("CustomFieldName")]
        public string? S { get; set; }
        [CustomName("CustomFieldName")]
        public decimal? D { get; set; }
        public char[]? C { get; set; }
        private char[]? CC { get; set; }

        public TestClass()
        {

        }
        public TestClass(int i)
        {
            I = i;
        }
        public TestClass(int i, int ii, string s, decimal d, char[] c, char[] cc) : this(i)
        {
            S = s;
            D = d;
            C = c;
            II = ii;
            CC = cc;

        }

    }
}