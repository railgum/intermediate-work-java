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
        this.id = countId;
        this.name = name;
        this.amount = amount;
        this.weigthPrize = weigthPrize;
    }

}
