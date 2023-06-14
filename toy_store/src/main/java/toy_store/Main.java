package toy_store;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {

        ToysList tl = new ToysList<>();

        Toy doll = new Toy("1", "Barbie", "25", "20");
        Toy constructor = new Toy("2", "Lego", "20", "10");
        Toy robot = new Toy("3", "Aibo", "55", "8");

        tl.add(doll);
        tl.add(constructor);
        tl.add(robot);

        System.out.println(tl);

        // int totalChance = tl.getTotalChance();
        // System.out.println(totalChance);

        tl.getToy();

        // int lSize = tl.getSize();





        // System.out.println(lSize);

        // List<Integer> ids = new ArrayList<>();
        // for (int i = 0; i < lSize; i++) {
        //     ids.add()

        // }

        // BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));

        // ToysQueue tq = new ToysQueue();

        // Toy doll = new Toy("1", "Barbie", "50", "20");
        // Toy constructor = new Toy("2", "Lego", "25", "10");
        // Toy robot = new Toy("3", "Aibo", "10", "8");

        // tq.add(doll);
        // tq.add(constructor);
        // tq.add(robot);

        // System.out.println(tq);
        // int qSize = tq.getQSize();
        // System.out.println(qSize);

    }
}