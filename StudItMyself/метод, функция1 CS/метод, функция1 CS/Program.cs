using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace метод__функция1_CS
{
    internal class Program
    {
        static void PrintLine (string symbol, uint symbolsCount)
        {
            for (int i = 0; i < symbolsCount; i++)
                Console.WriteLine(symbol);
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Введите символ: ");
            string symbol = Console.ReadLine();

            Console.WriteLine("Введите количество символов ");
            uint symbolsCount = uint.Parse(Console.ReadLine());

            PrintLine(symbol, symbolsCount);
            Console.ReadLine();

        }
    }
}
