using System;
using System.Collections.Generic;

namespace CRMApp
{
    class Program
    {
        // Здесь создается статический список для хранения клиентов
        static List<Customer> customers = new List<Customer>();

        static void Main(string[] args)
        {
            bool exit = false;
            while (!exit)
            {
                Console.WriteLine("1. Добавить клиента");
                Console.WriteLine("2. Показать список клиентов");
                Console.WriteLine("3. Выход");
                Console.Write("Выберите действие: ");
                string choice = Console.ReadLine();

                switch (choice)
                {
                    case "1":
                        AddCustomer();
                        break;
                    case "2":
                        ShowCustomers();
                        break;
                    case "3":
                        exit = true;
                        break;
                    default:
                        Console.WriteLine("Некорректный выбор. Попробуйте снова.");
                        break;
                }

                Console.WriteLine();
            }
        }

        static void AddCustomer()
        {
            Console.Write("Введите имя клиента: ");
            string name = Console.ReadLine();
            Console.Write("Введите email клиента: ");
            string email = Console.ReadLine();
            Console.Write("Введите номер телефона клиента: ");
            string phone = Console.ReadLine();

            // Создание нового объекта Customer и добавление его в список customers
            Customer newCustomer = new Customer
            {
                Name = name,
                Email = email,
                Phone = phone
            };

            customers.Add(newCustomer);

            Console.WriteLine("Клиент добавлен успешно!");
        }

        static void ShowCustomers()
        {
            if (customers.Count == 0)
            {
                Console.WriteLine("Список клиентов пуст.");
                return;
            }

            Console.WriteLine("Список клиентов:");
            foreach (var customer in customers)
            {
                Console.WriteLine($"Имя: {customer.Name}, Email: {customer.Email}, Телефон: {customer.Phone}");
            }
        }
    }

    class Customer
    {
        public string Name { get; set; }
        public string Email { get; set; }
        public string Phone { get; set; }
    }
}
