using System.Diagnostics;
using System.Text;
using static System.Net.Mime.MediaTypeNames;

namespace GB_HW_CS8
{
    internal class Program
    {
        //Напишите консольную утилиту для копирования файлов
        //Пример запуска: utility.exe file1.txt file2.txt


        
        
        static void Main(string[] args)
        {
            MyFile(@"C:\Users\User\Desktop\LessonsCS\GB_HW_CS8\3.txt.txt");
            
            
            
            //MyFile(@"C:\Users\User\Desktop\LessonsCS\GB_HW_CS8\1.txt.txt");
            
            
            //Lessons8 lessons8 = new Lessons8();
            //lessons8.MyCopyFile(@"C:\Users\User\Desktop\LessonsCS\GB_HW_CS8\obj", "1.txt", "1.txt");

            //Пример запуска: utility.exe c:\t file1.txt


            //Напишите утилиту читающую тестовый файл и выводящую на экран строки 
            //    содержащие искомое слово.


            //var mainPath = args[0];
            //string fileName = args[1];
            //SomeMethod(mainPath, fileName);

        }

        public static void SomeMethod(string directory, string fileName)
        {



            var dirs = Directory.EnumerateDirectories(directory);
            var files = Directory.EnumerateFiles(directory);

            foreach (var file in files)
            {
                if (file.Contains(fileName))
                {
                    Console.WriteLine($"Искомый файл {fileName} + " +
                        $"находится {directory}");
                    break;
                }
            }

            foreach (var dir in dirs)
            {
                SomeMethod(dir, fileName);
            }


        }

        public static void MyFile(string path)
        {
            using (FileStream fs = new FileStream(path, FileMode.OpenOrCreate))
            {
                using (BufferedStream bs = new BufferedStream(fs))
                {
                    byte[] bytes = new Byte[fs.Length];
                    bs.Read(bytes, 0, bytes.Length);
                    string date = Encoding.UTF8.GetString(bytes);
                    string newDate = Environment.NewLine + "Моя новая строка!!!!!";
                    byte[] newBytes = Encoding.UTF8.GetBytes(newDate);
                    bs.Write(newBytes, 0, newBytes.Length);
                }
            }
            

            
        }

        //public static void MyFile(string path)
        //{
        //    if (!File.Exists(path))
        //    {
        //        Console.WriteLine("no file");
        //    }
        //    using (StreamReader sr = new StreamReader(path))
        //    {
        //        while (!sr.EndOfStream)
        //        {
        //            string value = sr.ReadLine();
        //            if (value.Contains("123"))
        //            {
        //                Console.WriteLine(value);
        //            }
                  

        //        }
                

        //    }

        //}        //public static void MyFile(string path)
        //{
        //    if (!File.Exists(path))
        //    {
        //        Console.WriteLine("no file");
        //    }
        //    using (StreamReader sr = new StreamReader(path))
        //    {
        //        while (!sr.EndOfStream)
        //        {
        //            string value = sr.ReadLine();
        //            if (value.Contains("123"))
        //            {
        //                Console.WriteLine(value);
        //            }
                  

        //        }
                

        //    }

        //}
    }
}