using GB_HW_Connect1;
using System.Net;
using System.Net.NetworkInformation;
using System.Net.Sockets;
using System.Text;

namespace Client
{
    internal class Program
    {
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
            UdpClient udpClient = new UdpClient();
            IPEndPoint iPEndPoint = new IPEndPoint(IPAddress.Parse(ip), 12345);

         
                
                string messageText="Привет " + i;
                //do
                //{
                //    Console.Clear();
                //    Console.WriteLine("Введите сообщение.");
                //    messageText = Console.ReadLine();

                //}
                //while (string.IsNullOrEmpty(messageText));

                Message message = new Message() { Text = messageText, NicknameFrom = From, NicknameTo = "Server", DateTime = DateTime.Now };
                string json = message.SerializeMessageToJson();

                byte[] data = Encoding.UTF8.GetBytes(json);
                udpClient.Send(data, data.Length, iPEndPoint);

                byte[] buffer = udpClient.Receive(ref iPEndPoint);
                var answer = Encoding.UTF8.GetString(buffer);

                Console.WriteLine(answer);
            

        }
    }
}