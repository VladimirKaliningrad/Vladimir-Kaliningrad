using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace Сортировка_пузыком_CS
{
    internal class Program
    {
        static void Main(string[] args)
        {
         /*********  сортировка пузырком  ***********/  
            
            Console.Write("Введите кол-ко элементов массива: ");
            int n = Convert.ToInt32 (Console.ReadLine());
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
            {
                Console.Write("Введите значение массива: ");
                array[i] = Convert.ToInt32(Console.ReadLine());
            }  
            Console.WriteLine("Начальный массив: [" + string.Join(", ", array) + "]");
            Console.WriteLine();
            
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n - 1; j++)
                {
                    if (array[j] > array[j + 1])
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                Console.WriteLine(i + "[" + string.Join(", ", array) + "]");

            }    
         
            /*const arr = [1, 44, 1, 23, 356, 254];
            funcion findMax(arr)
            {
                len max = arr[0];
                for (let num of arr) 
                {
                    if (max < num) 
                    {
                        max = num;
                    }
                }
                return max;

            }

            Console.log(findMax(arr)); */
            
             
            


        }
        

       


    }
}
