namespace MessageGB
{
    public class MessageRepository
    {
        private DataContext _context;

        public MessageRepository(DataContext context)
        {
            _context = context;
        }
    }
}
