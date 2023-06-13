package toy_store;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;


public class ToysQueue implements Iterable<Toy>{
    private Toy toy;

    public ToysQueue(Toy toy) {
        this.toy = toy;
    }

    private Queue<Toy> toysQ = new LinkedList<>();

    public void add(Toy toy) {
        toysQ.add(toy);
    }

    @Override
    public Iterator<Toy> iterator() {
        return toysQ.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(toy.toString());
        for (Toy toy : this) {
            sb.append(toy.toString() + "\n");
        }
        return sb.toString();
    }




}