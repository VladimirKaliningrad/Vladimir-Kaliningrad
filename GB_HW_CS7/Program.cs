using static System.Net.Mime.MediaTypeNames;
using System.Text.RegularExpressions;
using System.Collections.Specialized;
using System.Text;
using System.Reflection;

namespace CSharp_course_Lesson_and_DZ_7
{
    class Program
    {
        static void Main(string[] args)
        {

            var v = CreateTestClassInstance(1, 11, "aaaa", 3, new char[] { '1', '2', '3', '4' }, new char[] { 'a', 'b', 'c', 'd' });

            string str = ObjectToString(v);
            Console.WriteLine(str);
            object str2 = StringToObject(str);

        }

        public static TestClass CreateTestClassInstance(int i, int ii, string s, decimal d, char[] c, char[] cc)
        {
            var testClassType = typeof(TestClass);
            var testClass = Activator.CreateInstance(testClassType) as TestClass;

            var testClassTwo = Activator.CreateInstance(testClassType, new object[] { i });

            var testClassThird = Activator.CreateInstance(testClassType, new object[] { i, ii, s, d, c, cc });

            return testClassThird as TestClass;
        }
        public static string ObjectToString(object obj)
        {
            StringBuilder stringBuilder = new StringBuilder();
            var type = obj.GetType();
            stringBuilder.Append(type.ToString() + "\n");
            stringBuilder.Append(type.Assembly + "\n");
            stringBuilder.Append(type.Name + "\n");
            var properties = type.GetProperties(System.Reflection.BindingFlags.NonPublic | System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
            foreach (var item in properties)
            {
                var value = item.GetValue(obj);

                stringBuilder.Append(GetPropertyName(item) + ":");
                if (item.PropertyType == typeof(char[]))
                {
                    stringBuilder.Append(new String(value as char[]) + "\n");
                }
                else
                {
                    stringBuilder.Append(value + "\n");
                }
            }

            return stringBuilder.ToString();
        }


        private static string GetPropertyName(PropertyInfo property)
        {
            var customNameAttribute = (CustomNameAttribute)Attribute.GetCustomAttribute(property, typeof(CustomNameAttribute));
            return customNameAttribute != null ? customNameAttribute.CustomFieldName : property.Name;
        }


        public static object StringToObject(string endString)
        {
            string[] str = endString.Split("\n");
            var typeName = str[2];
            var assemblyName = str[1];
            var assembly = AppDomain.CurrentDomain.GetAssemblies().FirstOrDefault(a => a.FullName == assemblyName);
            if (assembly != null)
            {
                var type = assembly.GetTypes().FirstOrDefault(t => t.FullName == typeName);
                if (type != null)
                {
                    var obj = Activator.CreateInstance(type);
                    var properties = type.GetProperties(BindingFlags.Public | BindingFlags.Instance);
                    for (int i = 3; i < str.Length - 1; i++)
                    {
                        var propertyString = str[i].Split(":");
                        var propertyName = propertyString[0];
                        var propertyValue = propertyString[1];
                        var property = properties.FirstOrDefault(p => GetPropertyName(p) == propertyName.Trim());  // Используем вспомогательный метод для получения имени поля
                        if (property != null)
                        {
                            if (property.PropertyType == typeof(int))
                            {
                                property.SetValue(obj, int.Parse(propertyValue.Trim()));
                            }
                            else if (property.PropertyType == typeof(string))
                            {
                                property.SetValue(obj, propertyValue.Trim());
                            }

                        }
                    }
                    return obj;
                }
            }
            return null;
        }


    }
}