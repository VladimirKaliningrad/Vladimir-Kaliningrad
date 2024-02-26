using System;
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
            Order order1 = new Order("John Doe", "123-456-7890", "Bedding", 2);
            order1.Color = "White";
            order1.SoilingLevel = "Normal";
            order1.Wash = "Yes";
            orders.Add(order1);

            Console.WriteLine("Order 1:");
            PrintOrderInfo(order1);

            // Сохранение в Excel
            string filePath = "Orders.xlsx";
            SaveOrdersToExcel(orders, filePath);
            
            Console.WriteLine($"Orders saved to {filePath}");

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
        }

        private static void SaveOrdersToExcel(List<Order> orders, string filePath)
        {
            FileInfo file = new FileInfo(filePath);

            using (ExcelPackage package = new ExcelPackage(file))
            {
                ExcelWorksheet worksheet = package.Workbook.Worksheets.Add("Orders");

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
}
