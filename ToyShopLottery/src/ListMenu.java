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
                Начнем розыгрыш?
                --------------------------------------
                ** 1 => Да, я везунчик!
           
                ** 0 => Я не туда попал. Выйти
                """);
        return scanner.readLine();
    }

    public String changeWeightPrize() throws IOException {
        System.out.println("""
                -------------------------------
                Введите новый вес игрушки
                -------------------------------
                ** 0 => Выход
                """);
        return scanner.readLine();
    }

}
