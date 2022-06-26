package decemberFirstSteps.P10;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int catsCount = Integer.parseInt(scanner.nextLine());
        double foodTotal = 0;
        int catGroup1 = 0;
        int catGroup2 = 0;
        int catGroup3 = 0;
        for (int i = 1; i <= catsCount; i++) {
            double foodPerDay = Double.parseDouble(scanner.nextLine());
            foodTotal = foodTotal + foodPerDay; // foodTotal += foodPerDay
            if (foodPerDay >= 100 && foodPerDay < 200) {
                catGroup1++;
            }
            if (foodPerDay >= 200 && foodPerDay < 300) {
                catGroup2++;
            }
            if (foodPerDay >= 300 && foodPerDay < 400) {
                catGroup3++;
            }

        }

        System.out.printf("Group 1: %d cats. %n", catGroup1);
        System.out.printf("Group 2: %d cats. %n", catGroup2);
        System.out.printf("Group 3: %d cats. %n", catGroup3);
        System.out.printf("Price for food per day: %.2f lv.", (foodTotal / 1000) * 12.45);
    }
}
