package toy_store;

import java.util.Comparator;
import java.util.Queue;
import java.util.Random;

public class Game {
    private static Toy toy;


// private Comparator <Toy> comparator = new Comparator<Toy>() {
//     @Override
//     public int compare (Toy toy1, Toy toy2) {
//         return toy1.getWeight() - toy2.getWeight();
//     }
// };

    public static int getToy(int numberOfToys) {
        Random random = new Random();
        int win = random.nextInt(numberOfToys)+1;
        return win;

    }

}