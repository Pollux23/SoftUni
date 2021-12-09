package december.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P03AnimalType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;

               /*
               if ("dog".equals(animal)) {
               System.out.println("mammal");
               } else if ("crocodile".equals(animal) || "tortoise".equals(animal) || "snake".equals(animal)) {
                System.out.println("reptile");
                } else {
                System.out.println("unknown");
                }
               */


        }
    }
}
