using static System.Runtime.InteropServices.JavaScript.JSType;
using System.Text;
using System.Xml.Linq;
using System;
using System.Xml.Serialization;
using System.Text.Json;

namespace GB_HW_CS9
{
    internal class Program
    {







        //[XmlRoot(\"Data. Root\")]

        //public class DataRoot
        //{
        //    [XmlArray(\"Data.Root.Names\")]
        //    [XmlArrayItem(\"Name\")]
        //    public string[] Name;

        //    [XmlElement (typeof (DataEntry))]
        //    public DataEntry Entry;

        //    [XmlElement(typeof(DataX))]
        //    public DataX X;
        //}
        //[XmlType(\"Data.Entry\")]
        //public class DataEntry
        //{
        //    [XmlAttribute]
        //    public string LinkedEntry;
        //    [XmlElement(\"Data.Name\")]
        //    public string Name;
        //}
        //[XmlType(\"Data_x0023_ExtendedEntry\")]
        //public class DataX
        //{
        //    [XmlElement(\"Data.Name\")]
        //    public string Name;
        //    [XmlElement(\"Data_x0023_Extended\")]
        //    public string DataExt;
        //}

        static void Main(string[] args)
        {

            var fileJson = "{\"Current\":{\"Time\":\"2023-06-18T20:35:06.722127+04:00\",\"Temperature\":29," +
            "\"Weathercode\":1,\"Windspeed\":2.1,\"Winddirection\":1},\"History\":[{\"Time\":" +
            "\"2023-06-17T20:35:06.77707+04:00\",\"Temperature\":29,\"Weathercode\":2,\"Windspeed\":2.4," +
            "\"Winddirection\":1},{\"Time\":\"2023-06-16T20:35:06.777081+04:00\",\"Temperature\":22," +
            "\"Weathercode\":2,\"Windspeed\":2.4,\"Winddirection\":1},{\"Time\":" +
            "\"2023-06-15T20:35:06.777082+04:00\"," +
            "\"Temperature\":21,\"Weathercode\":4,\"Windspeed\":2.2,\"Winddirection\":1}]}";
            List<string> res = new List<string>();

            res = findValueInJSON(fileJson);
            var weatherInfo = JsonSerializer.Deserialize<WeatherInfo>(fileJson);
            Console.ReadLine();
        }

        public static List<string> findValueInJSON(string file)
        {
            List<string> result = new List<string>();
            return result;
        }


        public class Weather
        {
            public DateTime Time { get; set;}
            public double Temperature { get; set;}
            public int Weathercode { get; set;}
            public double Windspeed { get; set;}
            public int Winddirection { get; set;}

        }








            //var xml = \"\"\"

            //    <? xml version = \"1.0\" encoding = \"utf-8\" ?>
            //    < Data.Root xmlns:xsi = \"http://www.w3.org/2001/XMLSchema-instance\" xmlns: xsd = \"http://www.w3.org/2001/XMLSchema\" >
            //    < Data.Root.Names >
            //    < Name > Name1 </ Name >
            //    < Name > Name2 </ Name >
            //    < Name > Name3 </ Name >
            //    </ Data.Root.Names >

            //    < Data.Entry LinkedEntry = \"Name1\" >
            //    < Data.Name > Name2 </ Data.Name >
            //    </ Data.Entry >

            //    < Data_x0023_ExtendedEntry LinkedEntry = \"Name2\" >
            //    < Data.Name > Name1 </ Data.Name >
            //    < Data_x0023_Extended > NameOne </ Data_x0023_Extended >
            //    </ Data_x0023_ExtendedEntry >
            //    </ Data.Root >
            //    \"\"\";

            //DataRoot dataRoot = new DataRoot();
            //dataRoot.Name = new string[] { \"Name1\", \"Name2\", \"Name3\", };
            //dataRoot.Entry = new DataEntry();

            //dataRoot.Entry.LinkedEntry = \"Name1\";
            //dataRoot.Entry.Name = \"Name2\";

            //dataRoot.X = new DataX();
            //dataRoot.X.Name = \"Name1\";
            //dataRoot.X.DataExt = \"NameOne\";


            //var seriolaze = new XmlSerializer(typeof(DataRoot));
            //seriolaze.Serialize(Console.Out, dataRoot);
        }
    }
}