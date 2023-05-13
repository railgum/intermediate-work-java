import java.io.BufferedReader;
import java.io.IOException;

public class ListMenu {
    private BufferedReader scanner;

    public ListMenu(BufferedReader scanner) {
        this.scanner = scanner;
    }
    public String selectFunction() throws IOException {
        System.out.println("""
                --------------------------------------
                Добро пожаловать в программу розыгрыша игрушек!
                --------------------------------------
                ** 1 => Показать игрушки
                ** 2 => Редактировать игрушки
                --------------------------------------
                ** 0 => Я не туда попал. Выйти
                """);
        return scanner.readLine();
    }
    public String selectForChange() throws IOException {
        System.out.println("""
                -------------------------------
                Что вы хотите изменить?
                -------------------------------
                ** 1 => Изменить количество
                ** 2 => Изменить вес
                -------------------------------
                ** 0 => Выход
                """);
        return scanner.readLine();
    }

}
