import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
        public static void updateView() throws IOException {
            Toy toy1 = new Toy("Робот", 10, 10);
            Toy toy2 = new Toy("Медведь", 1, 20);
            Toy toy3 = new Toy("Утка", 7, 14);
            Toy toy4 = new Toy("Конструктор", 3, 72);
            Toy toy5 = new Toy("Кукла Барби", 8, 35);
            Toy toy6 = new Toy("Лото", 4, 48);
            Toy toy7 = new Toy("Дельфин", 9, 15);
            Toy toy8 = new Toy("Пианино", 2, 90);

            ListToys listToys = new ListToys();
            listToys.add(toy1);
            listToys.add(toy2);
            listToys.add(toy3);
            listToys.add(toy4);
            listToys.add(toy5);
            listToys.add(toy6);
            listToys.add(toy7);
            listToys.add(toy8);

            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
            ListMenu table = new ListMenu(scanner);
            Add add = new Add(scanner);
            Change change = new Change(listToys,table);

            View viewInfo = new View(scanner,table,listToys,add,change);
            viewInfo.printInfo();
        }
}