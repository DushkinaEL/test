package Exmaple;

import java.util.Scanner;

public class Login {
    public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String name = scanner.nextLine();
        System.out.println("Создайте пароль");
        String password = scanner.nextLine();
        if (password.length()< 8 || password.length()> 15) {
            do {
                System.out.println("Длина пароля долна составлять от 8 до 15 символов");
                password = scanner.nextLine();
            } while (password.length()< 8 || password.length()> 15);
        }
        System.out.printf("%s, Ваш новый пароль: %s", name, password);
        System.out.println("все круто");
    }
}
