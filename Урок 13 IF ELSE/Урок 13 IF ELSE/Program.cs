using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*
 * Конструкция if else
 * 
  */



namespace Урок_13_IF_ELSE
{
    internal class Program
    {
        static void Main(string[] args)
        {
             /*
         bool isInfected = false;

            if (isInfected)
            {
                Console.WriteLine("Персонаж инфицирован!");
            }
            else
            {
                Console.WriteLine("Персонаж здоров!");
               
            } */


            int a;

            a = int.Parse(Console.ReadLine());

            if ( a == 5)
            {
                Console.WriteLine("а равно 5");
            }

            else
            {
                Console.WriteLine("a не равно 5");
            }

        }
    }
}
