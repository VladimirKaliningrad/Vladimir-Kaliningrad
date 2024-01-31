using Microsoft.AspNetCore.Mvc;

namespace MessageGB
{
    public class UserController

    [Route("api/[controller]")]
    [ApiController]
    public class UserController : ControllerBase
    {
        private UserRepository _userRepository;
        private JwtService _jwtService;

        public UserController(UserRepository userRepository, JwtService jwtService)
        {
            _userRepository = userRepository;
            _jwtService = jwtService;
        }

        [HttpPost("login")]
        public IActionResult Login([FromBody] UserLoginModel userLoginModel)
        {
            // Проверка логина и пароля пользователя
            // Если пользователь аутентифицирован успешно, генерируйте и возвращайте JWT токен

            var user = _userRepository.ValidateUser(userLoginModel.Username, userLoginModel.Password);

            if (user == null)
            {
                return Unauthorized();
            }

            var token = _jwtService.GenerateToken(user);
            return Ok(new { Token = token });
        }

        // Другие методы для работы с пользователями
    }
}
