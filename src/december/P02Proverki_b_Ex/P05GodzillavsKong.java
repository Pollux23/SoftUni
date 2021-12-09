package december.P02Proverki_b_Ex;

import java.util.Scanner;

public class P05GodzillavsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceOneSuit = Double.parseDouble(scanner.nextLine());

        double decorSum = budget * 0.1;
        double sumSuit = people * priceOneSuit;

        if (people > 150) {
            sumSuit = sumSuit * 0.9;
        }

        double totalSum = decorSum + sumSuit;

        double diff = Math.abs(totalSum - budget);
        if (totalSum <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }


    }
}
