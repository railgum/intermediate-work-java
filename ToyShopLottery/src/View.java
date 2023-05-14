import java.io.BufferedReader;
import java.io.IOException;

public class View {
    private final BufferedReader scanner;
    private final ListMenu table;
    private final ListToys listToys;
    private final Add add;
    private final Change change;
    private final PrizeDraw listPrize;


    public View(BufferedReader scanner,
                ListMenu table,
                ListToys listToys,
                Add add,
                Change change,
                PrizeDraw listPrize) {
        this.scanner = scanner;
        this.table = table;
        this.listToys = listToys;
        this.add = add;
        this.change = change;
        this.listPrize = listPrize;
    }
    public void printInfo() throws IOException {
        while (true){
            switch (table.selectFunction()){
                case "1":
                    System.out.println("Список игрушек:");
                    listToys.sort();
                    listToys.printAll();
                    break;
                case "2":
                    change.changeBy(scanner);
                    break;
                case "3":
                    listToys.add(add.addNewToy());
                    break;
                case "4":
                    listPrize.printPrize(listToys);
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Введите корректное значение");
            }
        }
    }
}
