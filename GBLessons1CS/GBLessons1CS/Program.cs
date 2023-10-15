internal class Program
{
    static void Main(string[] args)
    {
        //Console.WriteLine("Hello, World!");/////в консоле индексы см

        //if (args.Length > 0)
        //{
        //    string name = args[0];
        //    string message = $"Привет {name}";
        //    Console.WriteLine(message);
        //}
        //else
        //{
        //    System.Console.WriteLine("Hello World");
        //}
        ///////////////////////////////////////
        ///

        //Console.WriteLine($"args[0]={args[0]}");

        /////////////////////////////////////////////////////////////

        //    int sum = 0;///// находим среднее число

        //    foreach (string arg in args)
        //    {
        //        sum += int.Parse(arg);
        //    }
        //    int avg = sum / args.Length;
        //    Console.WriteLine(avg);
        ////////////////////////////////////////////////////
        ////// находим минимальное число

        //int Min = int.MaxValue;
        //foreach (string arg in args)
        //{
        //    int temp = int.Parse(arg);
        //    if (Min > temp)
        //        Min = temp;
        //}
        //Console.WriteLine(Min);

        //////////////////////////////////////////////
        //
        //        Домашняя работа
        //Написать программу-калькулятор, вычисляющую выражения вида
        //a + b, a - b, a / b, a* b,
        //введенные из командной строки, и выводящую результат выполнения на
        //экран.
        //Пример вызова программы:
        //        program.exe 10 + 20
        //Пример вывода результата:
        //        10 + 20 = 30
        //В результате операции сложения чисел 10 и 20 получился ответ 30.

        if (args.Length == 3)
        {
            int result = 0;
            int num1 = int.Parse(args[0]);
            string operation = args[1];
            int num2 = int.Parse(args[2]);

            if (operation == "+")
            {
                result = num1 + num2;
            }
            if (operation == "-")
            {
                result = num1 - num2;
            }
            if (operation == "/")
            {
                result = num1 / num2;
                ;
            }
            if (operation == "*")
            {
                result = num1 * num2;
            }

            Console.WriteLine("Результат выполнения операции ("
                 + operation + ") = " + result);

        }
        else
            Console.WriteLine("Для использования программы введите:" +
                " число знак (+-/*) число через пробел");



    }
}