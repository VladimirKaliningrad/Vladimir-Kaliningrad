using System.Security.Cryptography.X509Certificates;

namespace GBLessons4CS
{

    internal class Program
    {
        /*Задача 1: Фильтрация и проекция данных с использованием LINQ
Предоставьте студентам некоторую коллекцию объектов(например, список студентов) и попросите их решить следующие задачи:

--Найти всех студентов, чей возраст меньше 25 лет.
--Вывести имена всех студентов в алфавитном порядке.
--Выбрать студентов, обучающихся на факультете инженерии.
--Посчитать средний возраст студентов.
--Попросите студентов использовать LINQ для решения этих задач.*/

       /*Задача 2: Отсортировать заказы по сумме в убывающем порядке.
Сгруппировать заказы по клиентам и вывести количество заказов для каждого клиента.
Найти клиента с наибольшей суммой заказов.
Вывести список клиентов и общую сумму их заказов.
Попросите студентов использовать LINQ для сортировки и группировки данных.*/
         private static void Main(string[] args)
        {
            //var numbers = new List<int> { 1, 2, 3, 4 , 5, 6, 7 };
            //var numbers2 = numbers.MyWhere<int>(x => x > 3);
            //foreach (var number in numbers2)
            //{
            //    Console.WriteLine(number);
            //}
            //List<Student> students = new List<Student>
            //{
            //    new Student { Name = "Alice", Age = 22, Faculty = "Engineering" },
            //    new Student { Name = "Bob", Age = 25, Faculty = "Science" },
            //    new Student { Name = "Charlie", Age = 19, Faculty = "Engineering" },
            //    new Student { Name = "David", Age = 30, Faculty = "Arts" },
            //    new Student { Name = "Eve", Age = 21, Faculty = "Science" },



            //};

            //var findAge = students.Where(x => x.Age < 25);
            //var sortName = students.OrderBy(x => x.Name).Select(x => x.Name);
            //var findEngeners = students.Where(x => x.Faculty.Equals("Engineering"));
            //var averageEge = students.Average(x => x.Age);

            //findAge.ToList().ForEach(x => Console.WriteLine($"{x.Name} - {x.Age}"));
            //sortName.ToList().ForEach(x => Console.WriteLine($"{x}, "));
            //findEngeners.ToList().ForEach(x => Console.WriteLine($"{x.Name} - {x.Faculty}"));
            //Console.WriteLine(averageEge);
            List<Order> orders = new List<Order>
            {
            new Order { OrderID = 1, CustomerName = "Alice", OrderDate = new DateTime(2023, 6, 1), TotalAmount = 150.0 },
            new Order { OrderID = 2, CustomerName = "Bob", OrderDate = new DateTime(2023, 6, 2), TotalAmount = 75.5 },
            new Order { OrderID = 3, CustomerName = "Charlie", OrderDate = new DateTime(2023, 6, 2), TotalAmount = 220.0 },
            new Order { OrderID = 4, CustomerName = "David", OrderDate = new DateTime(2023, 6, 3), TotalAmount = 100.0 },
            new Order { OrderID = 5, CustomerName = "Eve", OrderDate = new DateTime(2023, 6, 4), TotalAmount = 85.5 },
            // Добавьте другие заказы по вашему усмотрению
            };

            var sum = orders.OrderByDescending(x => x.TotalAmount);
            var sum2 = from order in orders
                       orderby order.TotalAmount
                       select order;

            var totalAmountForClients = orders.GroupBy(x => x.CustomerName).Select(x => new { name = x.Key, count=x.Count() });

            var richClient = orders.GroupBy(x => x.CustomerName)
                .Select(x => new { name = x.Key, sumTotalAmount = x.Sum(ta => ta.TotalAmount) })
                .OrderBy(ta => ta.sumTotalAmount).First().name;

            var clientsTA = orders.GroupBy(x => x.CustomerName)
                .Select(x => new { name = x.Key, sumTotalAmount = x.Sum(ta => ta.TotalAmount) });

            sum.ToList().ForEach(x => Console.WriteLine($"{x.CustomerName} - {x.TotalAmount}"));
            totalAmountForClients.ToList().ForEach(x=> Console.WriteLine($"{x.name} {x.count}"));
            Console.WriteLine(richClient);
            clientsTA.ToList().ForEach(x => Console.WriteLine($"{x.name} - {x.sumTotalAmount}"));


            List<string> strings = new List<string>
            {
                "Apple",
                "Banana",
                "Cherry",
                "Date",
                "Fig",
                "Grapes"
            };

            var sortedList = strings.OrderBy (x => x.Length).ToList();
            sortedList.ForEach(Console.WriteLine);
          







        }
    }
}

//class Student
//{
//    public string Name { get; set; }
//    public int Age { get; set; }
//    public string Faculty { get; set; }
//}
