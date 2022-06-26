package decemberFirstSteps.P07Exam;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysMissing = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double deerOne = Double.parseDouble(scanner.nextLine());
        double deerTwo = Double.parseDouble(scanner.nextLine());
        double deerThree = Double.parseDouble(scanner.nextLine());

        double allDeerFoodInKgForOneDay = deerOne + deerTwo + deerThree;
        double foodNeededInDays = allDeerFoodInKgForOneDay * daysMissing;

        double leftFood = foodLeftKg - foodNeededInDays;

        if (leftFood >= 0){
            System.out.printf("%.0f kilos of food left.",Math.floor(leftFood));
        } else{
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(Math.abs(leftFood)) );
        }


    }
}
