namespace GBLessons6CS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //if (MyTryParse("string", out int num))
            //{
            //     Console.WriteLine(num);
            //}
            //////////////////////////////////////////////////////////////////////


            try
            {
                ProcessNumber(-4);
            }
            catch (NegativeNumberException ex)
            {
                Console.WriteLine(ex.ToString());
                if (ex.InnerException != null)
                {
                    Console.WriteLine(ex.InnerException.Message);
                }
            }
            catch { }


        }
        /// 
        /// //////////////////////////////////////////////////////////////////////////////
        /// </summary>
        /// <param name="number"></param>
        /// <exception cref="NegativeNumberException"></exception>
        //1 исключение если нет цифры то ошибка-исключение

        //static bool MyTryParse(string myString, out int num)
        //{
        //    num = 0;
        //    try
        //    {
        //        num = Convert.ToInt32(myString);
        //    }
        //    catch(FormatException ex)
        //    {
        //        Console.WriteLine(ex.Message);
        //        return false;
        //    }
        //    return true;
        //}
        ///////////////////////////////////////////////////////////////////////////////////

        static void ProcessNumber(int number)
        {
            if (number < 0)
            {
                throw new NegativeNumberException("ваше число отрицательное", new Exception ("ошибка исключение") );
            }

            Console.WriteLine(number);

        }





    }

}