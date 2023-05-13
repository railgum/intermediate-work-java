import java.io.BufferedReader;
import java.io.IOException;

public class Add {
    private BufferedReader scanner;

    public Add(BufferedReader scanner) {
        this.scanner = scanner;
    }

    public Toy addNewToy() throws IOException {
        System.out.println("Добавляем новую игрушку");
        System.out.println("Введите название игрушки");
        String name = scanner.readLine();
        System.out.println("Введите количество");
        int amount = Integer.parseInt(scanner.readLine());
        System.out.println("Введите вес игрушки");
        int weightPrize = Integer.parseInt(scanner.readLine());
        System.out.printf("Добавляем: %s, количество: %s, вес: %s \n", name, amount, weightPrize);

        return new Toy(name, amount, weightPrize);
    }
    
}
