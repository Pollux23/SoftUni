package decemberFirstSteps.P10;

import java.util.Scanner;

public class P05xxx {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        int foodKg = Integer.parseInt(scanner.nextLine()) * 1000;
        int totalFoodEaten = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Adopted")) {
                break;
            } else {
                int foodEatenPerDay = Integer.parseInt(input);
                totalFoodEaten += foodEatenPerDay;
            }
        }

        if (totalFoodEaten > foodKg) {
            System.out.printf("Food is not enough. You need %d grams more.", totalFoodEaten - foodKg);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodKg - totalFoodEaten);
        }
    }
}