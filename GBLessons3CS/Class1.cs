using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GBLessons3CS
{
    internal class Class1
    {
            //Дан список целых чисел(числа не последовательны), 
            //в котором некоторые числа повторяются.
            //Выведите список чисел на экран, исключив из него повторы.
        public void getArray()
        {

            List<int> ints = new List<int> { 0, 1, 1, -1, 101, 102, 101, 11, 1111, 11 };
            List<int> array = new List<int>();

            foreach (var item in ints)
            {
                if (!array.Contains(item))
                {
                    array.Add(item);
                }


            }

            array.ForEach(Console.WriteLine);

        }


        public void getArray2()
        {
            List<int> ints = new List<int> { 0, 1, 1, -1, 101, 102, 101, 11, 1111, 11 };

            ints = ints.Distinct().ToList();

            ints.ForEach(Console.WriteLine);
        }


        //дан список целых чисел(числа не последовательны), 
        //в котором некоторые числа повторяются.
        //выведите список чисел на экран, расположив их
        //в порядке возрастания частоты повторения

        public void getArray3()
        {
            List<int> ints = new List<int> { 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5, 6, 7, 0 };

            Dictionary<int, int> Dict = new Dictionary<int, int>();

            foreach (var value in ints)
            {
                if (Dict.ContainsKey(value))
                {
                    Dict[value]++;
                }
                else
                {
                    Dict.Add(value, 1);
                }


            }

            foreach (var item in Dict)
            {
                Console.WriteLine(item);                     
            }

        }


    }

}
