package toy_store;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ToysList<T extends Toy> implements Iterable<Toy> {

    List<Toy> toysList = new ArrayList<>();

    // метод удаляет игрушку из списка при количестве, равном нулю
    private void checkList() {
        for (int i = 0; i < toysList.size(); i++) {
            int toyCurrentAmount = Integer.parseInt(toysList.get(i).getAmount());
            if (toyCurrentAmount > 0)
                continue;
            else {
                toysList.remove(i);
            }
        }
    }

    // метод возвращает частоту выпадения игрушки (вес в % от 100)
    private int getTotalChance() {
        checkList();
        int total = 0;
        for (int i = 0; i < toysList.size(); i++) {
            total += Integer.parseInt(toysList.get(i).getWeight());
        }
        return total;
    }

    // Метод добавляет игрушку
    public void loadToy(Toy toy) {
        toysList.add(toy);
    }

    // Метод получения выигрыша путем комбинации случайного числа и веса игрушки
    public void getToy() {
        int totalChance = getTotalChance();
        Random random = new Random();
        int randomChance = random.nextInt(totalChance);
        for (int i = 0; i < toysList.size(); i++) {
            randomChance -= Integer.parseInt(toysList.get(i).getWeight());
            if (randomChance <= 0) {

                System.out.printf("Вы выиграли %s!\n", toysList.get(i).getName());
                int amount = Integer.parseInt(toysList.get(i).getAmount()) - 1;
                toysList.get(i).setAmount(Integer.toString(amount));
                log(i);
                break;
            }
        }
    }

    // Метод логгирования выпавших выигрышей
    private void log(int i) {
        String file = "log_winnings.txt";
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Пользователь выиграл ");
            writer.append(toysList.get(i).getName());
            writer.append(". ");
            writer.write("Осталось игрушек ");
            writer.append(toysList.get(i).getAmount());
            writer.append(".\n");
            writer.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Iterator<Toy> iterator() {
        return toysList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Toy item : this) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}