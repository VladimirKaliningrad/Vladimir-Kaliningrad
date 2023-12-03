﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;

namespace GB_HW_Connect1
{
    public class Message
    {
        public string Text { get; set; }
        
        public DateTime DateTime { get; set; }

        public string NicknameFrom { get; set; }

        public string NicknameTo { get; set; }

        public string SerializeMessageToJson() => JsonSerializer.Serialize(this);
  
        public static Message? DeserializeFromJson(string message) => JsonSerializer.Deserialize<Message>(message);

        public void Print()
        {
            Console.WriteLine(ToString());
        }

        public override string ToString()
        {
            return $"{this.DateTime} получено сообщение {this.Text} от  {this.NicknameFrom}";
        }


    }

    
}
