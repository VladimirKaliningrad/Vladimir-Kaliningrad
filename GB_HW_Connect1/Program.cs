using System.Net;
using System.Net.Sockets;
using System.Text;

namespace GB_HW_Connect1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Server("Hello");
        }

        public void task1 ()
        {
            Message msg = new Message()
            {
                Text = "Hello",
                DateTime = DateTime.Now,
                NicknameFrom = "Vladimir",
                NicknameTo = "All"
            };
            string json = msg.SerializeMessageToJson();
            Console.WriteLine(json);
            Message? msgDeserialized = Message.DeserializeFromJson(json);
        }
       

        public static void Server(string name)
        {
            
            UdpClient udpClient = new UdpClient(12345);
            IPEndPoint iPEndPoint = new IPEndPoint(IPAddress.Any, 0);
            
            Console.WriteLine("Сервер ждет сообщение от клиента");


            while (true)
            {
                byte[] buffer = udpClient.Receive (ref iPEndPoint);
                var messageText = Encoding.UTF8.GetString(buffer);

                ThreadPool.QueueUserWorkItem(obj => {  
                Message message = Message.DeserializeFromJson(messageText);
                message.Print();

                byte[] reply = Encoding.UTF8.GetBytes("Сообщение получено");
                udpClient.Send(reply, reply.Length,iPEndPoint);
                Console.WriteLine($"Отправлено {reply.Length}");   
                });
            }


            //using (Socket listner = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Udp))
            //{
            //    var remoteEndpoint = new IPEndPoint(IPAddress.Parse("127.0.0.1"), 1234);
            //    listner.Blocking = true;
            //    listner.Bind(remoteEndpoint);
            //    listner.Listen(100);

            //    Console.WriteLine("wait");
            //    var socket = listner.Accept();

            //    Console.WriteLine("connected");
            //    listner.Close();
            //}

        }


    }
}