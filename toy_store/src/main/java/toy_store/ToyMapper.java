package toy_store;

public class ToyMapper {

    public String map(Toy toy) {
        return String.format("%s,%s,%s,%s", toy.getId(), toy.getName(), toy.getWeight(), toy.getAmount());
    }

    public Toy map(String line) {
        String[] lines = line.split(",");
        return new Toy (lines[0], lines[1], lines[2], lines[3]);
    }
}