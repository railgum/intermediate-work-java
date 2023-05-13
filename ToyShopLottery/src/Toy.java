public class Toy implements Comparable<Toy> {
    private final int id;
    private String name;
    private int amount;
    private int weightPrize;
    private static int countId;
    static {
        countId = 0;
    }

    public Toy(String name, int amount, int weightPrize) {
        this.id = ++countId;
        this.name = name;
        this.amount = amount;
        this.weightPrize = weightPrize;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeightPrize(int weightPrize){
        this.weightPrize = weightPrize;
    }

    public int getWeightPrize() {
        return weightPrize;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Название игрушки: " + getName() +
                "\nID: " + getId() +
                "\nКоличество: " + getAmount() +
                "\nВес: " + getWeightPrize();
    }
    @Override
    public int compareTo(Toy toy){
        return this.getId();
    }
}
