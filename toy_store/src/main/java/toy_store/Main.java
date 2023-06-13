package toy_store;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception{

        // BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));

        ToysQueue tq = new ToysQueue();
        Game game = new Game();
        // Queue<Toy> toysQ = new LinkedList<>();

        Toy doll = new Toy(1, "Barbie", 50, 20);
        Toy constructor = new Toy(2, "Lego", 20, 10);
        Toy robot = new Toy(3, "Aibo", 5, 8);

        tq.add(doll);
        tq.add(constructor);
        tq.add(robot);

        // toysQ.add(doll);
        // toysQ.add(constructor);
        // toysQ.add(robot);

        System.out.println(tq);
        int qSize = tq.getQSize();

        System.out.println(qSize);




    }
}