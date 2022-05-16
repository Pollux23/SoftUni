package december.P09ExamPreparation;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int daysNum = Integer.parseInt(scanner.nextLine());


        double oneDay = 0;

        if (season.equals("Winter") && destination.equals("Dubai")) {
            oneDay = 45000;
        } else if (season.equals("Summer") && destination.equals("Dubai")) {
            oneDay = 40000;

        } else if (season.equals("Winter") && destination.equals("Sofia")) {
            oneDay = 17000;
        } else if (season.equals("Summer") && destination.equals("Sofia")) {
            oneDay = 12500;

        } else if (season.equals("Winter") && destination.equals("London")) {
            oneDay = 24000;
        } else if (season.equals("Summer") && destination.equals("London")) {
            oneDay = 20250;
        }

        double totalSum = oneDay * daysNum;

        if (destination.equals("Dubai")) {
            totalSum = totalSum - totalSum * 0.3;
        } else if (destination.equals("Sofia")) {
            totalSum = totalSum + totalSum * 0.25;
        }

        double moneyLeft = budget - totalSum;
        double moneyNeeded = totalSum - budget;
        if (budget > totalSum) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", moneyLeft);
        }else {
            System.out.printf("The director needs %.2f leva more!", moneyNeeded);
        }
    }
}
