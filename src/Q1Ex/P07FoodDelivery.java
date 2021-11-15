package Q1Ex;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuCount = Integer.parseInt(scanner.nextLine());

        double chikenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegetarianMenuPrice = 8.15;

        double menusAll = (chickenMenuCount * chikenMenuPrice) + (fishMenuCount * fishMenuPrice) + (vegetarianMenuCount * vegetarianMenuPrice);

        double desert = menusAll * 0.2;

        double altogether = menusAll + desert + 2.50;

        //System.out.printf("%.2f", altogether);
        System.out.println(altogether);

    }
}
