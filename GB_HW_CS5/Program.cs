namespace GB_HW_CS5
{
    internal class Program
    {

        delegate void myDelegate(string message);
        static void Main(string[] args)
        {

            //Создайте метод, который принимает список действий(делегат Action)
            //List<Action> list = new List<Action>();
            //Action action = null;

            //list.Add(Print1);
            //list.Add(Print2);
            //doAction(list);

            /*List<myDelegate> myDelegate = new List<myDelegate>() 
            {
                (message) => Console.WriteLine($"1 delegate {message}"),
                (message) => Console.WriteLine($"2 delegate {message}"),

            };

            //PrintDelegate(myDelegate);*/

            var calc = new Calc();
            calc.MyEventHandler += Calc_MyEventHandler;
            calc.Sum(10);
            calc.Sub(1);
            calc.Multy(5);
            calc.Divide(3);
            calc.CancelLast();
            calc.CancelLast();
            calc.CancelLast();
            calc.CancelLast();
            calc.CancelLast();

        }

        private static void Calc_MyEventHandler(object? sender, EventArgs e)
        {
            if (sender is Calc)

                Console.WriteLine(((Calc)sender).Result);
        }


        //Спроектируем интерфейс калькулятора,поддерживающего простые 
        //      арифметические действия,
        //      хранящего результат и также способного выводить 
        //      информациюо результате при помощи события

        /*static void PrintDelegate(List<myDelegate> del)
        {
            foreach (var item in del)
            {
                item("333");
            }
        }

        static void Print1()
        {
            Console.WriteLine("111");
        }

        static void Print2()
        {
            Console.WriteLine("222");
        }

        static void doAction(List<Action>lis)
        {
            foreach (var item in lis)
            {
                item();
            }

        }*/
    }
}