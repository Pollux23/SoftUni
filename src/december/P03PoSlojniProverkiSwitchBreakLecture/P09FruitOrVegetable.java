package december.P03PoSlojniProverkiSwitchBreakLecture;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {

        // https://prnt.sc/259lcef

        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете име на продукт, въведено от потребителя, и проверява дали е плод или зеленчук.
//⦁  	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
//⦁  	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
//⦁   	Всички останали са "unknown"
//         Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт.

        String input = scanner.nextLine();

        switch (input) {
            case "banana":
                System.out.println("fruit");
                break;
            case "apple":
                System.out.println("fruit");
                break;
            case "kiwi":
                System.out.println("fruit");
                break;
            case "cherry":
                System.out.println("fruit");
                break;
            case "lemon":
                System.out.println("fruit");
                break;
            case "grapes":
                System.out.println("fruit");
                break;

            case "tomato":
                System.out.println("vegetable");
                break;
            case "cucumber":
                System.out.println("vegetable");
                break;
            case "pepper":
                System.out.println("vegetable");
                break;
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");

//                OR
//                if (input.equals("banana") || input.equals("apple") || input.equals("kiwi")
//                        || input.equals("cherry") || input.equals("lemon") || input.equals("grapes")) {
//                    System.out.println("fruit");
//
//                } else if (input.equals("tomato") || input.equals("cucumber") || input.equals("pepper")
//                        || input.equals("carrot")) {
//                    System.out.println("vegetable");
//
//                } else {
//                    System.out.println("unknown");
        }
    }
}
