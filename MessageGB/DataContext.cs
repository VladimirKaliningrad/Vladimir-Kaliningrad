using System.Collections.Generic;

namespace MessageGB
{
    public class DataContext
    {
        public DbSet<User> Users { get; set; }
        public DbSet<Message> Messages { get; set; }

        
    }
}
