using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace CSharp_course_Lesson_and_DZ_8
{
    internal class FileSearchUtility
    {
        public static void SearchForFile(string directory, string fileName)
        {
            try
            {
                var files = Directory.EnumerateFiles(directory, fileName, SearchOption.AllDirectories);
                foreach (var file in files)
                {
                    Console.WriteLine($"Искомый файл {fileName} находится по пути: {file}");
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Ошибка при поиске файла: {ex.Message}");
            }
        }

        public static void SearchForValueInFile(string fileName, string searchValue)
        {
            try
            {
                if (File.Exists(fileName))
                {
                    using (StreamReader sr = new StreamReader(fileName))
                    {
                        string line;
                        while ((line = sr.ReadLine()) != null)
                        {
                            if (line.Contains(searchValue))
                            {
                                Console.WriteLine($"Найдено значение {searchValue} в файле {fileName}: {line}");
                            }
                        }
                    }
                }
                else
                {
                    Console.WriteLine("Файл не существует");
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Ошибка при чтении файла: {ex.Message}");
            }
        }
    }
}
