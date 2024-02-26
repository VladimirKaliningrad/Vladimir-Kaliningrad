﻿using System;
using System.Collections.Generic;
using System.IO;
using OfficeOpenXml;

namespace LaundryService
{
    class Program
    {
        static void Main(string[] args)
        {
            ExcelPackage.LicenseContext = LicenseContext.NonCommercial;

            List<Order> orders = new List<Order>();
            string filePath = @"C:\Users\User\Desktop\LessonsCS\testLaundry\clients.csv";
            List<Client> clients = ReadClientsFromCSV(filePath);

            foreach (var client in clients)
            {
                Order order = new Order(client.Name, client.PhoneNumber, client.LaundryType, client.Quantity);
                order.Color = client.Color;
                order.SoilingLevel = client.SoilingLevel;
                order.Wash = client.Wash;
                orders.Add(order);
            }

            Console.WriteLine("Orders created for clients:");
            foreach (var order in orders)
            {
                PrintOrderInfo(order);
            }

            // Сохранение в Excel
            string excelFilePath = "Orders.xlsx";
            SaveOrdersToExcel(orders, excelFilePath);

            Console.WriteLine($"Orders saved to {excelFilePath}");
            Console.ReadLine();
        }

        private static void PrintOrderInfo(Order order)
        {
            Console.WriteLine($"Name: {order.Name}");
            Console.WriteLine($"Phone Number: {order.PhoneNumber}");
            Console.WriteLine($"Laundry Type: {order.LaundryType}");
            Console.WriteLine($"Quantity: {order.Quantity}");
            Console.WriteLine($"Color: {order.Color}");
            Console.WriteLine($"Soiling Level: {order.SoilingLevel}");
            Console.WriteLine($"Wash: {order.Wash}");
            Console.WriteLine();
        }

        private static void SaveOrdersToExcel(List<Order> orders, string filePath)
        {
            FileInfo file = new FileInfo(filePath);

            using (ExcelPackage package = new ExcelPackage(file))
            {
                ExcelWorksheet worksheet = null;

                // Проверяем, существует ли уже лист "Orders"
                if (package.Workbook.Worksheets["Orders"] != null)
                {
                    // Если лист существует, удаляем его
                    package.Workbook.Worksheets.Delete("Orders");
                }

                // Создаем новый лист "Orders"
                worksheet = package.Workbook.Worksheets.Add("Orders");

                // Заголовки столбцов
                worksheet.Cells[1, 1].Value = "Name";
                worksheet.Cells[1, 2].Value = "Phone Number";
                worksheet.Cells[1, 3].Value = "Laundry Type";
                worksheet.Cells[1, 4].Value = "Quantity";
                worksheet.Cells[1, 5].Value = "Color";
                worksheet.Cells[1, 6].Value = "Soiling Level";
                worksheet.Cells[1, 7].Value = "Wash";

                // Данные заказов
                for (int i = 0; i < orders.Count; i++)
                {
                    var order = orders[i];
                    worksheet.Cells[i + 2, 1].Value = order.Name;
                    worksheet.Cells[i + 2, 2].Value = order.PhoneNumber;
                    worksheet.Cells[i + 2, 3].Value = order.LaundryType;
                    worksheet.Cells[i + 2, 4].Value = order.Quantity;
                    worksheet.Cells[i + 2, 5].Value = order.Color;
                    worksheet.Cells[i + 2, 6].Value = order.SoilingLevel;
                    worksheet.Cells[i + 2, 7].Value = order.Wash;
                }

                package.Save();
            }
        }

        private static List<Client> ReadClientsFromCSV(string filePath)
        {
            List<Client> clients = new List<Client>();

            using (var reader = new StreamReader(filePath))
            {
                // Пропускаем заголовок
                reader.ReadLine();

                while (!reader.EndOfStream)
                {
                    var line = reader.ReadLine();
                    var values = line.Split(',');

                    Client client = new Client
                    {
                        Name = values[0],
                        PhoneNumber = values[1],
                        LaundryType = values[2],
                        Quantity = int.Parse(values[3]),
                        Color = values[4],
                        SoilingLevel = values[5],
                        Wash = values[6]
                    };

                    clients.Add(client);
                }
            }

            return clients;
        }
    }

    class Order
    {
        public Order(string name, string phoneNumber, string laundryType, int quantity)
        {
            Name = name;
            PhoneNumber = phoneNumber;
            LaundryType = laundryType;
            Quantity = quantity;
        }

        public string Name { get; set; }
        public string PhoneNumber { get; set; }
        public string LaundryType { get; set; }
        public int Quantity { get; set; }
        public string Color { get; set; }
        public string SoilingLevel { get; set; }
        public string Wash { get; set; }
    }

    class Client
    {
        public string Name { get; set; }
        public string PhoneNumber { get; set; }
        public string LaundryType { get; set; }
        public int Quantity { get; set; }
        public string Color { get; set; }
        public string SoilingLevel { get; set; }
        public string Wash { get; set; }
    }
}
