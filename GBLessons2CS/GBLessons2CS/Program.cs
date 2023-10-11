internal class Program
{
    //class SomeClass
    //{
    //    public int SomeVariable;
    //}

    //////////////таблица умножения в цыкле////////////////////////
    static void Main(string[] args)
    {
        for (int i =0; i<=9; i++)
        {
            for (int k =0; k<=9; k++)
            {
                Console.Write($"{i}X{k}={i * k}".PadLeft(10));
            }
            Console.WriteLine();
        }
        //SomeClass a = new SomeClass();
        //a.SomeVariable = 10;

        //SomeClass b = a;
        //a.SomeVariable = 20;

        //Console.WriteLine($"a={a.SomeVariable}, b = {b.SomeVariable}");
    }
}