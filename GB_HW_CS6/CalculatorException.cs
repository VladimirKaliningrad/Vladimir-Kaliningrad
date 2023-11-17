using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GB_HW_CS6
{
    public class CalculatorException : Exception
    {
        public CalculatorException ()
        {

        }

        public CalculatorException(string error) : base (error)
        {

        }

    }
}
