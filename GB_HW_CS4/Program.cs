namespace GB_HW_CS4
{
    internal class Program
    {



        //Урок 4. Коллекции(часть 2)
        //Дан массив и число.Найдите три числа в массиве сумма которых равна искомому числу.
        //    Подсказка: если взять первое число в массиве, можно ли найти в оставшейся его 
        //    части два числа равных по сумме первому.

        static int[] FindTripletWithSum(int[] arr, int targetSum)
        {
            Array.Sort(arr);
            int n = arr.Length;

            for (int i = 0; i < n - 2; i++)
            {
                int left = i + 1;
                int right = n - 1;

                while (left < right)
                {
                    int currentSum = arr[i] + arr[left] + arr[right];
                    if (currentSum == targetSum)
                    {
                        return new int[] { arr[i], arr[left], arr[right] };
                    }
                    else if (currentSum < targetSum)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }
            return null;
        }

        static void Main(string[] args)
        {
            int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            
            int targetSum = 10;

            int[] result = FindTripletWithSum(arr, targetSum); 
            
            if (result != null)
            {
                Console.WriteLine("Тройка чисел с заданной суммы: " + string.Join(", ", result));
            }
            else
            {
                Console.WriteLine("Тройка чисел с заданной суммы не найдена.");
            }



        }

        
    }


}