namespace GBLessons8CS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var bytes = new byte[101];

            for (int i = 0; i < 101; i++)
                bytes[i] = (byte)i;

            using (var stream = new MemoryStream(bytes))
            {
                int b = 0;
                while ((b = stream.ReadByte()) >= 0)
                {
                    Console.Write((byte)b + " ");
                }
            } 
     

        }
    }
}