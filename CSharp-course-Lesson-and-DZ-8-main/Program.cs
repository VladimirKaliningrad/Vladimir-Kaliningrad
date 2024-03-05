namespace CSharp_course_Lesson_and_DZ_8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string directory = "путь_к_директории"; 
            string fileName = "искомое_имя_файла"; 
            string searchValue = "3333";

            FileSearchUtility.SearchForFile(directory, fileName);
            FileSearchUtility.SearchForValueInFile(fileName, searchValue);
        }

        



    }
}