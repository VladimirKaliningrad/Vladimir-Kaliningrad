using GB_HW_Connect1;
using System.Net;
using System.Net.NetworkInformation;
using System.Net.Sockets;
using System.Text;

namespace Client
{
    internal class Program
    {
        static UdpClient udpClient = new UdpClient();
        static IPEndPoint iPEndPoint = new IPEndPoint(IPAddress.Parse(ip), 12345);
        static void Main(string[] args)
        {
            for (int i =0; i<10; i++)
            {
                int num = i;
                Task.Run(()=>SentMessage("Vladimir",num));
            }
            Console.ReadKey();
        }
        public static void SentMessage(string From, int i, string ip="127.0.0.1")
        {
          
            //string messageText = "Привет " + i;

            //do
            //{
            //    Console.Clear();
            //    Console.WriteLine("Введите сообщение.");
            //    messageText = Console.ReadLine();

            //}
            //while (string.IsNullOrEmpty(messageText));
        }
        public static void m1()
        {
            Message message = new Message() { Text = "Привет", NicknameFrom = "Vladimir", NicknameTo = "Server", DateTime = DateTime.Now, command = Commands.Register };
            string json = message.SerializeMessageToJson();

            byte[] data = Encoding.UTF8.GetBytes(json);
            udpClient.Send(data, data.Length, iPEndPoint);
        }

        public static void m2()
        {
            Message message = new Message() { Text = "Привет", NicknameFrom = "Ivan", NicknameTo = "Server", DateTime = DateTime.Now};
            string json = message.SerializeMessageToJson();

            byte[] data = Encoding.UTF8.GetBytes(json);
            udpClient.Send(data, data.Length, iPEndPoint);
        }
        public static void m3()
        {
            Message message = new Message() { Text = "Привет", NicknameFrom = "Vladimir", NicknameTo = "Ivan", DateTime = DateTime.Now, command = Commands.Register };
            string json = message.SerializeMessageToJson();

            byte[] data = Encoding.UTF8.GetBytes(json);
            udpClient.Send(data, data.Length, iPEndPoint);
        }
     
    }
}