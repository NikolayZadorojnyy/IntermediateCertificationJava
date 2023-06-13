package toy_store;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class ToysQueue <T extends Toy> implements Iterable <Toy>{
    // private Toy toy;

    private Queue<Toy> toysQ = new LinkedList<>();

    public void add(Toy toy) {
        toysQ.add(toy);
    }

    public int getQSize() {
        int size = toysQ.size();
        return size;
    }

    @Override
    public Iterator <Toy> iterator() {
        return toysQ.iterator();
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

// private Toy toy;

// private Queue<Toy> toysQ = new LinkedList<>();

// public void add(Toy toy) {
// toysQ.add(toy);
// }

// @Override
// public Iterator<Toy> iterator() {
// return toysQ.iterator();
// }

// @Override
// public String toString() {
// StringBuilder sb = new StringBuilder(toy.toString());
// for (Toy toy : this) {
// sb.append(toy.toString() + "\n");
// }
// return sb.toString();
// }