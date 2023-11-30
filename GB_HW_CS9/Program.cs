using System;
using System.IO;
using System.Text.Json;
using System.Xml;
using System.Xml.Linq;

class Program
{
    static void Main()
    {
        try
        {
            string jsonInput = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";

            // Преобразование JSON в XML
            string xmlOutput = ConvertJsonToXml(jsonInput);

            // Вывод результата
            Console.WriteLine("JSON:\n" + jsonInput);
            Console.WriteLine("\nXML:\n" + xmlOutput);
        }
        catch (Exception ex)
        {
            Console.WriteLine("Ошибка: " + ex.Message);
        }
    }

    static string ConvertJsonToXml(string json)
    {
        using (JsonDocument doc = JsonDocument.Parse(json))
        {
            // Создаем корневой элемент XML
            XElement rootElement = new XElement("root");

            // Рекурсивно обходим JsonDocument и строим XML
            ConvertJsonToXmlRecursive(doc.RootElement, rootElement);

            // Создаем XML-документ с корневым элементом
            XDocument xDocument = new XDocument(rootElement);

            // Преобразовываем XML в строку
            using (StringWriter stringWriter = new StringWriter())
            {
                using (XmlWriter xmlTextWriter = XmlWriter.Create(stringWriter))
                {
                    xDocument.Save(xmlTextWriter);
                }
                return stringWriter.ToString();
            }
        }
    }

    static void ConvertJsonToXmlRecursive(JsonElement jsonElement, XElement parentElement)
    {
        foreach (JsonProperty prop in jsonElement.EnumerateObject())
        {
            XElement element = new XElement(prop.Name);

            if (prop.Value.ValueKind == JsonValueKind.Object)
            {
                // Рекурсивный вызов для вложенных объектов
                ConvertJsonToXmlRecursive(prop.Value, element);
            }
            else if (prop.Value.ValueKind == JsonValueKind.Array)
            {
                // Рекурсивный вызов для вложенных массивов
                foreach (JsonElement arrayElement in prop.Value.EnumerateArray())
                {
                    XElement arrayItemElement = new XElement("item");
                    ConvertJsonToXmlRecursive(arrayElement, arrayItemElement);
                    element.Add(arrayItemElement);
                }
            }
            else
            {
                // Обработка значений простых типов
                element.Value = prop.Value.ToString();
            }

            parentElement.Add(element);
        }
    }
}
