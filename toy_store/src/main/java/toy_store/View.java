package toy_store;

import java.util.Scanner;

public class View {

    private final ToysList<Toy> tl = new ToysList<>();

    public void run() {
        System.out.println("Аттракцион невиданной щедрости запущен! ");

        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("""
                     Введите одну из команд управления:
                     LOAD - загрузить данные игрушки
                     LIST - показать список игрушек
                     PLAY - запустить розыгрыш
                     EXIT - выход из программы\s""");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Такой команды нет! Введите правильную команду.");
            }
            if (com == Commands.EXIT) {
                System.out.println("Шоу закончено. Всем спасибо!");
                return;
            }
            try {
                switch (com) {
                    case LOAD -> {
                        Toy toy = setToy();
                        tl.loadToy(toy);
                    }
                    case LIST -> System.out.println(tl);
                    case PLAY -> tl.getToy();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private Toy setToy() {
        String id = prompt("Id: ");
        String name = prompt("Имя: ");
        String weigth = prompt("Частота выпадения(вес в % от 100): ");
        String amount = prompt("Количество: ");
        return new Toy(id, name, weigth, amount);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
