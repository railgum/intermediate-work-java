import java.io.BufferedReader;
import java.io.IOException;

public class Change implements Changeable<Toy> {
    private ListToys listToys;
    private ListMenu table;

    public Change(ListToys listToys, ListMenu table) {
        this.listToys = listToys;
        this.table = table;
    }
    @Override
    public void changeBy(BufferedReader bufferedReader) throws IOException {
        System.out.println("Введите ID игрушки");
        int id = Integer.parseInt(bufferedReader.readLine());
        boolean isExit = false;
        for (Toy toy : listToys.getToys()) {
            if(toy.getId() == id){
                System.out.printf("Игрушка: %s, Количество: %s, Вес: %s \n",
                                    toy.getName(),toy.getAmount(),toy.getWeightPrize());
                while (!isExit){
                    switch (table.selectForChange()){
                        case "1":
                            System.out.println("Введите новое количество");
                            toy.setAmount(Integer.parseInt(bufferedReader.readLine()));
                            isExit = true;
                            break;
                        case "2":
                            System.out.println("Введите новый вес");
                            toy.setWeightPrize(Integer.parseInt(bufferedReader.readLine()));
                            isExit = true;
                            break;
                        case "0":
                            isExit = true;
                            break;
                        default:
                            System.out.println("Некорректный ввод");
                    }
                }
                System.out.println("Обновленные данные:");
                System.out.println(toy);
            }
        }
    }
}
