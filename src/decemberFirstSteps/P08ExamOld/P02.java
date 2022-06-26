package decemberFirstSteps.P08ExamOld;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beersCount = Integer.parseInt(scanner.nextLine());
        int chipsCount = Integer.parseInt(scanner.nextLine());


        double beerPrice = beersCount * 1.2;
        double chipsPrice = (beerPrice * 0.45);
        double chipsTotalPrice = Math.ceil(chipsPrice * chipsCount);

        double totalSum = beerPrice + chipsTotalPrice;
        double moneyLeft = budget - totalSum;
        double moneyNeeded = totalSum - budget;

        // could use one variable - Math.abs ( budget - totalSum )
        // diff - use in both of the placeholders

        if (budget >= totalSum){
            System.out.printf("%s bought a snack and has %.2f leva left.", name, moneyLeft);
        }else {
            System.out.printf("%s needs %.2f more leva!", name, moneyNeeded);
        }



    }
}
