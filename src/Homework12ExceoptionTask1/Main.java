package Homework12ExceoptionTask1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        {
            User currentUser = getUserByLoginAndPassword(login, password);
            validateUser(currentUser);

            System.out.println("Доступ предоставлен");
        }
    }
    public static void validateUser(User user) throws AccessDeniedException {

        if (user.age < 18) {
            throw new AccessDeniedException("Вам еще нет 18 лет, доступ запрещен.");
        }
    }
        public static User[] getUsers() {
        User user1 = new User("Kevin", "qweasdzxc321", "kevin@gmail.com", 17);
        User user2 = new User("Yerke", "qwerty", "orda.kz@mail.ru", 28);
        User user3 = new User("Mark","abc","mark@gmail.com",55);
        return new User[]{user1, user2,user3};
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.login) && password.equals(user.password)) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден.");
    }
    }

