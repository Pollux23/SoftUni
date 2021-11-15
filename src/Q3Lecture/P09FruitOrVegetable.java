package Q3Lecture;

import java.util.Scanner;

public class P09FruitOrVegetable {

    //     Да се напише програма, която чете име на продукт, въведено от потребителя, и проверява дали е плод или зеленчук.
    //    • Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
    //    • Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
    //    • Всички останали са "unknown"
    //    Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт.
    // http://i.imgur.com/BKX210r.png

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("banana") || input.equals("apple") || input.equals("kiwi")
                || input.equals("cherry") || input.equals("lemon") || input.equals("grapes")) {
            System.out.println("fruit");

        } else if (input.equals("tomato") || input.equals("cucumber") || input.equals("pepper")
                || input.equals("carrot")) {
            System.out.println("vegetable");

        } else {
            System.out.println("unknown");

        }

        // OR ---> switch :
        //            switch (input) {
        //            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> System.out.println("fruit");
        //            case "tomato", "cucumber", "pepper", "carrot" -> System.out.println("vegetable");
        //            default -> System.out.println("unknown");
        //        }


    }
}
