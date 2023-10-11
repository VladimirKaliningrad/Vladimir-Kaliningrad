namespace GBLessonsCS1
{
    internal class Program
    {
        class Person
        {
            public string Name = String.Empty;
            public DateTime Birthday;
            public int Height;
        }
        static void Main(string[] args)
        {
            Person person = new Person();
            person.Name = "Vladimir";
            person.Birthday = DateTime.Parse("01.01.1983");
            person.Height = 192;

            Console.WriteLine($"{person.Name}, {person.Birthday}, {person.Height}");

            Person person2 = new Person();
            person2.Name = "Vladimir V.";
            person2.Birthday = DateTime.Parse("11.06.2006");
            person2.Height = 190;

            Console.WriteLine($"{person2.Name}, {person2.Birthday}, {person2.Height}");

        }
        //////////////////ограничение в возрасте, если больше 18 лет, 18+
        public bool IsAdult(int adult)
        {
            var delta = DateTime.Now.Year - Birthday.Year;
            if (delta > 18 || (delta == 18 && DateTime.Now.DayOfYear <= Birthday.DayOfYear))
            {
                return true;
            }
            else
                return false;
        }

    }
}