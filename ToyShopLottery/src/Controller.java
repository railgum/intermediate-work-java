import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
        public static void updateView() throws IOException {
            Toy toy1 = new Toy("Робот", 2, 60);
            Toy toy2 = new Toy("Медведь", 2, 20);
            Toy toy3 = new Toy("Утка", 2, 74);
            Toy toy4 = new Toy("Конструктор", 2, 82);
            Toy toy5 = new Toy("Кукла Барби", 2, 35);
            Toy toy6 = new Toy("Лото", 2, 48);
            Toy toy7 = new Toy("Дельфин", 2, 55);
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
            PrizeDraw prize = new PrizeDraw(listToys);

            View viewInfo = new View(scanner,table,listToys,add,change,prize);
            viewInfo.printInfo();
        }
}