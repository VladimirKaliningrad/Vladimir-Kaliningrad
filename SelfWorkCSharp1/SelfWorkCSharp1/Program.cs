using System;

namespace SelfWorkCSarp
{
    /* треугольник
     * ключевое слово continue
     */
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Введите высоту треугольника: ");
            int height = int.Parse(Console.ReadLine());

            for (int i = 0; i < height; i++)
            {
                for (int j = height; j > i; j--)
                {
                    Console.Write("*");
                }
                 Console.WriteLine();
            }
            
          
            /*for (int i=0; i < 5;i++)
            {
                if (i==3)
                {
                    continue;
                }
                if (i==1)
                {
                    continue;
                }


                Console.WriteLine(i);

            }
            Console.ReadLine();*/
        }
    }


}
