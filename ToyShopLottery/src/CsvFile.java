public class CsvFile {
    public String formatStringFile(Toy toy) {
        return String.format("ID - %d | Name - %s | Weight - %s | Amount - %s\n",
                toy.getId(),toy.getName(),toy.getWeightPrize(),
                toy.getAmount());
    }
}
