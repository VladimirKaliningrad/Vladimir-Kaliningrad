using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GB_HW_CS5
{
    internal class Calc : ICalc
    {
        public double Result { get; set; } = 0;

        private Stack<double> LastResult { get; set; } = new Stack<double>();

        public event EventHandler<EventArgs> MyEventHandler;

        private void PrintResult()
        {
            MyEventHandler?.Invoke(this, new EventArgs());
        }

        public void Divide(int x)
        {
            Result /= x;
            PrintResult();
            LastResult.Push(Result);
        }

        public void Multy(int x)
        {
            Result *= x;
            PrintResult();
            LastResult.Push(Result);
        }

        public void Sub(int x)
        {
            Result -= x;
            PrintResult();
            LastResult.Push(Result);
        }

        public void Sum(int x)
        {
            Result += x;
            PrintResult();
            LastResult.Push(Result);
        }

        public void CancelLast()
        {
            if (LastResult.TryPop(out double res))
            {
                Result = res;

                Console.WriteLine("Последнее действие отменено. Результат равен: ");
                PrintResult();
            }
            else
            {
                Console.WriteLine("Невозможно отменить последнее действие");
            }


        }

    }
}

/*Арифметические методы должны выполняться как обычно
    а метод CancelLast должен отменять последнее действие. 
    При этом метод может отменить последовательно все действия 
    вплоть до самого последнего. Спросите как студенты планируют 
    реализовать отмену действия и если будут 
    трудности с ответами то подскажите им про стек*/


