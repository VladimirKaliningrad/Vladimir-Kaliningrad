using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GBLessons6CS
{
    public class NegativeNumberException : Exception
    {
        public NegativeNumberException()
        {

        }

        public NegativeNumberException(string massege) : base(massege)
        {


        }

        public NegativeNumberException (string massege, Exception ex) : base (massege, ex)
        {


        }


    }
}
