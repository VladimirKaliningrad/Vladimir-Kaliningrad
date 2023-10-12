using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace методы_начало
{
    internal class Program
    {
        static void Main(string[] args)
        {
            void SayHello () { Console.WriteLine("Hello"); }
            void SayHello1() => Console.WriteLine("Hello1");

            SayHello();
            SayHello1();

        }
    }
}
