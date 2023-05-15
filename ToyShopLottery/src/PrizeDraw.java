import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// Класс розыгрыша игрушек
public class PrizeDraw implements SpinWheel {
    private final ListToys listToys;
    private final ListPrize listPrize;
    public PrizeDraw(ListToys listToys) {
        this.listToys = listToys;
        this.listPrize = new ListPrize();
    }
//    Путь сохранения файла призовых игрушек
    private final String path = "X:\\Geek\\Developer\\2_block\\Intermediate_works\\intermediate-work-java\\ToyShopLottery\\src\\Prize";
    @Override
    public ListToys printPrize(ListToys listToys) {
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

        Iterator<Toy> iterator = listToys.getToys().iterator();
        while (iterator.hasNext()){
            Toy toy = iterator.next();
            if(toy.getName().equals(prizeToy.getName())){
                toy.setAmount(toy.getAmount()-1);
            }
            if(toy.getAmount()<1){
                iterator.remove();
            }
        }
        return listToys;
    }
}
