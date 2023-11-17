using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GB_HW_CS6
{
    public class CalculatorOperationCauseOverflowException : CalculatorException
    {
        public CalculatorOperationCauseOverflowException()
        {

        }
        public CalculatorOperationCauseOverflowException(string error) : base(error)
        {

        }

    }
}
