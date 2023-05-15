import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// Класс розыгрыша игрушек
public class PrizeDraw implements SpinWheel {
    private ListToys listToys;
    private ListPrize listPrize;
    public PrizeDraw(ListToys listToys) {
        this.listToys = listToys;
        this.listPrize = new ListPrize();
    }
//    Путь сохранения файла призовых игрушек
    private String path = "X:\\Geek\\Developer\\2_block\\Intermediate_works\\intermediate-work-java\\ToyShopLottery\\src\\Prize";
    @Override
    public void printPrize(ListToys listToys) {
        Random random = new Random();
        int rndNum = random.nextInt(100);
        for (Toy toy : listToys.getToys()) {
            if (toy.getWeightPrize() >= rndNum) {
                listPrize.add(toy);
            }
        }
        int rndPrz = random.nextInt(listPrize.getListPrize().size());
        Toy prizeToy = listPrize.getListPrize().get(rndPrz);
        System.out.println("Поздравляем, ваш выигрыш: ");
        System.out.println(prizeToy.getName());
        try(FileWriter fileWriter = new FileWriter(path +".csv", true)){
            fileWriter.write(new CsvFile().formatStringFile(prizeToy));
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        for (Toy toy : listToys.getToys()) {
            if(toy.getName() == prizeToy.getName()){
                toy.setAmount(toy.getAmount()-1);

            }
        }
    }
}
