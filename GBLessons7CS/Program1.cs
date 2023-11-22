using System.Reflection;
using System.Text;

namespace Lesson7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Type type = typeof(TestClass);

            //var t1 = Activator.CreateInstance(type);
            //var t2 = Activator.CreateInstance(type, new Object[] { 1 });
            //var t3 = Activator.CreateInstance(type, new Object[] { 1, "строка", 2.0, new char[] { 'A', 'B', 'C' } });

            var s = ObjectToString(new TestClass(15, "STR", 2.2m, new char[] { 'A', 'B', 'C' }));
            Console.WriteLine(s);
            var o = StringToObject(s) as TestClass;



        }
        [AttributeUsage(AttributeTargets.Property)]
        class DontSaveAttribute : Attribute
        { }

        //static string ObjectToString(object o)
        //{
        //    StringBuilder sb = new StringBuilder();
        //    Type t = o.GetType();
        //    sb.Append(t.AssemblyQualifiedName + ":");
        //    sb.Append(t.Name + "|");
        //    var properties = t.GetProperties();


        //    foreach (var p in properties)
        //    {
        //        Console.WriteLine(p);

        //        if (p.GetCustomAttribute<DontSaveAttribute>() != null)
        //        {
        //            continue;
        //        }

        //        var value = p.GetValue(o);

        //        sb.Append(p.Name + ":");
        //        if (p.PropertyType == typeof(char[]))
        //        {
        //            sb.Append(new String(value as char[]) + "|");
        //        }
        //        else
        //            sb.Append(value + "|");

        //    }

        //    return sb.ToString();

        //}


        static string ObjectToString(object o)
        {
            StringBuilder sb = new StringBuilder();
            Type t = o.GetType();
            sb.Append(t.AssemblyQualifiedName + ":");
            sb.Append(t.Name + "|");
            var properties = t.GetProperties(BindingFlags.NonPublic | BindingFlags.Instance);
            var properties2 = t.GetProperties();

            foreach (var p in properties)
            {
                //Console.WriteLine(p);
                var value = p.GetValue(o);

                sb.Append(p.Name + ":");
                if (p.PropertyType == typeof(char[]))
                {
                    sb.Append(new String(value as char[]) + "|");
                }
                else
                    sb.Append(value + "|");

            }

            return sb.ToString();

        }
        static object StringToObject(string s)
        {
            var values = s.Split("|");

            var classAssemblyAndName = values[0].Split(':');
            var obj = Activator.CreateInstance(null, classAssemblyAndName[1])?.Unwrap();

            if (values.Length > 1 && obj != null)
            {
                var type = obj.GetType();
                Console.WriteLine(type);

                for (int i = 1; i < values.Length; i++)
                {
                    var nameAndValue = values[i].Split(":");
                    var pi = type.GetProperty(nameAndValue[0]);

                    Console.WriteLine($"{nameAndValue[0]}:{pi}");

                    if (pi == null)
                        continue;

                    if (pi.PropertyType == typeof(int))
                    {
                        pi.SetValue(obj, int.Parse(nameAndValue[1]));
                    }
                    if (pi.PropertyType == typeof(string))
                    {
                        pi.SetValue(obj, nameAndValue[1]);
                    }
                    if (pi.PropertyType == typeof(decimal))
                    {
                        pi.SetValue(obj, decimal.Parse(nameAndValue[1]));
                    }
                    if (pi.PropertyType == typeof(char[]))
                    {
                        pi.SetValue(obj, nameAndValue[1].ToCharArray());
                    }

                }
            }
            return obj;
        }

    }

    class TestClass
    {
        public int I { get; set; }
        private string? S { get; set; }
        public decimal D { get; set; }
        public char[]? C { get; set; }

        public TestClass()
        { }
        public TestClass(int i)
        {
            this.I = i;
        }
        public TestClass(int i, string s, decimal d, char[] c) : this(i)
        {
            this.S = s;
            this.D = d;
            this.C = c;
        }
    }
}