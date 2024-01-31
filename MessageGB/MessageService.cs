namespace MessageGB
{
    public class MessageService
    {
        private MessageRepository _messageRepository;

        public MessageService(MessageRepository messageRepository)
        {
            _messageRepository = messageRepository;
        }

    }
}
