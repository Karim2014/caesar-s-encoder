import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа для шифрования кода Цезаря.");
        System.out.print("Введите ключ (0-31): ");
        int key = scanner.nextInt();
        System.out.print("Введите ключевое слово: ");
        scanner.nextLine();
        String keyword = scanner.nextLine();

        Encryptor encryptor = new Encryptor(key, keyword);

        System.out.println("\nВведите сообщение");
        String message = scanner.nextLine();
        System.out.println("Зашифрованное сообщение: " + encryptor.encryptMessage(message));
    }

}
