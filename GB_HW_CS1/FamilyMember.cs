using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GB_HW_CS1
{
    public enum Gender
    {
        Male,
        Female
    }

    public class FamilyMember
    {
        //public FamilyMember[] Parents { get; set; }
        public FamilyMember Mother { get; set; }
        public FamilyMember Father { get; set; }
        public string Name { get; set; }
        public Gender Sex { get; set; }

        void Info(int indent = 0)
        {
            Console.WriteLine($"{new String('-', indent)}Имя {this.Name}");
        }
        public virtual void Print(int indent = 0)
        {
            Info(indent);
        }


    }

    public class AdultFamilyMember : FamilyMember
    {
        public FamilyMember[] Children { get; set; }
        public override void Print(int indent = 0)
        {
            base.Print(indent);

            foreach (var child in Children)
                child.Print(indent * 2);
        }

    }

}

