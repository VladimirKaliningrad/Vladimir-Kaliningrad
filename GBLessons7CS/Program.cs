


namespace GBLessons7CS
{
    internal class MyClass
    {
        static int MyField = 3;
        public int MyProperty => MyField * -1;
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            var obj = Activator.CreateInstance(typeof(int[]), new object[] { 10 });

            Console.WriteLine((obj as int[])?.Length);


        }
    }
}