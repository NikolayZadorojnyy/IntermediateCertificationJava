package toy_store;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ToysList <T extends Toy> implements Iterable<Toy>{

    List<Toy> toysList = new ArrayList<>();

    public void add(Toy toy) {
        toysList.add(toy);
    }


    private int getSize() {
        int size = toysList.size();
        return size;
    }

    public int getTotalChance () {
        int total = 0;
        for (int i = 0; i < toysList.size(); i++) {
            total += Integer.parseInt(toysList.get(i).getWeight());
        }
        return total;
    }


    @Override
    public Iterator <Toy> iterator() {
        return toysList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Toy item : this) {
            sb.append(item + "\n");
        }
        return sb.toString();
    }
}
