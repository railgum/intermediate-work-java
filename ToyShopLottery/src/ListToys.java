import java.util.*;

public class ListToys implements Printable {
    private final List<Toy> toys;
    public ListToys(){
        this.toys = new ArrayList<>();
    }
    public void add(Toy toy){
        this.toys.add(toy);
    }

    public List<Toy> getToys() {
        return toys;
    }

    @Override
    public void printAll() {
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }
    public void sort(){
        Collections.sort(toys);
    }
}
