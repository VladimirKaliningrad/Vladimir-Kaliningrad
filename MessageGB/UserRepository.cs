namespace MessageGB
{
    public class UserRepository
    {
        private DataContext _context;

        public UserRepository(DataContext context)
        {
            _context = context;
        }
    }
}
