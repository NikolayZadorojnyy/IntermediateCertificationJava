package toy_store;

// Класс описывает сущность игрушка
public class Toy {

    private String id = "";
    private final String name;
    private String weight;
    private String amount;



    public Toy(String id, String name, String weight, String amount) {
        this(name, weight, amount);
        this.id = id;
    }

    public Toy(String name, String weight, String amount) {
        this.name = name;
        this.weight = weight;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return String.format("ID: %s; Имя: %s; Вес: %s; Количество: %s", id, name, weight, amount);
    }
}
