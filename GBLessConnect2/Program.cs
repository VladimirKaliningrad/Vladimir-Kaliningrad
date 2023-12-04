namespace GBLessConnect2
{
    class Program
    {
        static void PrintTheread()
        {
            for (int i = 0, i < 10; i++)
            {
                Console.WriteLine($"{Thread.CurrentThread.ManagedThreadId} - one");
                Console.WriteLine($"{Thread.CurrentThread.ManagedThreadId} - two");
                Console.WriteLine($"{Thread.CurrentThread.ManagedThreadId}-  three");

            }
            
        }

        static void Main(string[] args)
        {
            for (int i =0, i < 10; i++)
            {
                Thread t = new Thread(PrintTheread);
                t.Start();
            }
        }
    }
}