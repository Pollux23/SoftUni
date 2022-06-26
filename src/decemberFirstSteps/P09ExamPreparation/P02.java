package decemberFirstSteps.P09ExamPreparation;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        double addedExpensesPercent = Double.parseDouble(scanner.nextLine());

        if (nightsCount > 7) {
            pricePerNight = pricePerNight - pricePerNight *  0.05;
        }

        double addedExpenses = budget * addedExpensesPercent / 100;
        double sumNights = pricePerNight * nightsCount;
        double totalSum = addedExpenses + sumNights;
        double moneyLeft = budget - totalSum;
        double moneyNeeded = totalSum - budget;

       if (budget > totalSum){
           System.out.printf("Ivanovi will be left with %.2f leva after vacation.", moneyLeft);
       } else {
           System.out.printf("%.2f leva needed.", moneyNeeded);
       }

    }
}
