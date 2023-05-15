import java.util.ArrayList;

public class ListPrize {
    private final ArrayList<Toy> listPrize;
    public ListPrize(){this.listPrize = new ArrayList<>();}
    public void add(Toy toy){this.listPrize.add(toy);}

    public ArrayList<Toy> getListPrize() {
        return listPrize;
    }
}
