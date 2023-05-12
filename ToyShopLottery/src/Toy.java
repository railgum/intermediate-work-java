public class Toy {
    private final int id;
    private String name;
    private int amount;
    private int weigthPrize;
    private static int countId;
    static {
        countId = 0;
    }

    public Toy(String name, int amount, int weigthPrize) {
        this.id = countId++;
        this.name = name;
        this.amount = amount;
        this.weigthPrize = weigthPrize;
    }

    public void setWeigthPrize(String weigthPrize){
        this.weigthPrize = weigthPrize;
    }

    public int getWeigthPrize() {
        return weigthPrize;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
