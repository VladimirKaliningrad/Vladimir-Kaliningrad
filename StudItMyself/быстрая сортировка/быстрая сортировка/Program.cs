using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace быстрая_сортировка
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arr = { 0, -5, 2, 3, 5, 9, -9, 7 };
            QuickSort(arr, 0, arr.Length - 1);
            Console.Write($"Отсортированный массив {string.Join(", ", arr)} ");

            void QuickSort(int[] inputArray, int minIndex, int maxIndex)
            {
                if (minIndex >= maxIndex) return;
                int pivot = GetPivotIndex(inputArray, minIndex, maxIndex);
                QuickSort(inputArray, minIndex, pivot - 1);
                QuickSort(inputArray, pivot + 1, maxIndex);
                return;
            }
            int GetPivotIndex(int[] inputArray, int minIndex, int maxIndex)
            {
                int pivotIndex = minIndex - 1;
                for (int i = minIndex; i <= maxIndex; i++)
                {
                    if (inputArray[i] < inputArray[maxIndex])
                    {
                        pivotIndex++;
                        Swap(inputArray, i, pivotIndex);
                    }
                }
                pivotIndex++;
                Swap(inputArray, pivotIndex, maxIndex);
                return pivotIndex;
            }
            void Swap(int[] inputArray, int leftValue, int rightValue)
            {
                int temp = inputArray[leftValue];
                inputArray[leftValue] = inputArray[rightValue];
                inputArray[rightValue] = temp;
            }



        }
    }
}
