import java.util.*;
import java.util.Comparator;

public class PrizeDraw implements SpinWheel {
    private ListToys listToys;
    public PrizeDraw(ListToys listToys) {
        this.listToys = listToys;
    }
    @Override
    public void printPrize(ListToys listToys) {
        Random random = new Random();
        int rndNum = random.nextInt(100);
        System.out.println(rndNum);
//        Set<Toy> listPrize = new TreeSet<>((a,b) -> b.getWeightPrize() - a.getWeightPrize());
//        Set<Toy> listPrize = new TreeSet<>();
        HashSet<Toy> listPrize = new HashSet<>();
        while (listPrize.isEmpty()){
            for (Toy toy : listToys.getToys()) {
                if (toy.getWeightPrize() >= rndNum) {
                    listPrize.add(toy);
                }
            }
        }
        for (Toy toy : listPrize) {
            System.out.println(toy);
        }
//        int i = 0;
//        Iterator iterator = listPrize.iterator();
//        while (i < 3 && iterator.hasNext()) {
//            System.out.println(listPrize.iterator());
//            i++;
//        }
    }
}
