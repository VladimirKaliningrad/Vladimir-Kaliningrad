package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    /**
     * 3.6. Нужно написать класс User (пользователь) с методом аутентификации по логину и паролю,
     * (В метод передаются логин и пароль, метод возвращает true, если пароль и логин совпадают, иначе - false)
     */
    @Test
    void userCreation() {
        User user = new User("user_0", "psw123", false);
        assertTrue(user.authenticate("user_0", "psw123"));
    }

    @Test
    void userCreationFailed() {
        User user = new User("user_0", "123psw", false);
        assertFalse(user.authenticate("user_0", "psw123"));
    }

    /**
     * 3.7. Нужно добавить класс UserRepository (Хранилище для работы с пользователями)
     * (В метод передается пользователь, если он зарегистрирован в системе (authenticate возвращает true)
     * то он попадает в список пользователей системы.
     */
    @Test
    void userRepository() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("user_0", "psw123", false);
        userRepository.addUser(userNA);
        assertFalse(userRepository.findByName(userNA.name));
    }

    @Test
    void userRepositoryNA() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("user_0", "psw123", false);
        userNA.authenticate("user_0", "psw23");
        userRepository.addUser(userNA);
        assertFalse(userRepository.findByName(userNA.name));
    }

    @Test
    void adminHasAccessListUsers() {

        //  User userAdmin = new User("user_a", "psw123", true);
        UserRepository userRepository = new UserRepository();

        User userNotAdmin1 = new User("user_0", "psw0", false);
        User userNotAdmin2 = new User("user_1", "psw1", false);

        //   userAdmin.authenticate("user_a","psw123");
        userNotAdmin1.authenticate("user_0", "psw0");
        userNotAdmin2.authenticate("user_1", "psw1");

        //   userRepository.addUser(userAdmin);
        userRepository.addUser(userNotAdmin1);
        userRepository.addUser(userNotAdmin2);

        userRepository.logoutAll();

        assertFalse(userNotAdmin1.isAuthenticate);

    }
}