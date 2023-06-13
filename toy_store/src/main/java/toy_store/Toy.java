package toy_store;

public class Toy {

    private int id;
    private String name;
    private int weight;
    private int amount;

    public Toy(int id, String name, int weight, int amount) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, name: %s, weight: %d, amount: %d", getId(), getName(), getWeight(), getAmount());
    }
}
