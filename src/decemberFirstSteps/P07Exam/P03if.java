package decemberFirstSteps.P07Exam;

import java.util.Scanner;

public class P03if {
    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.next();
        String location = scanner.next();

        double totalGrossReward;


        if (location.equals("Bulgaria") && season.equals("summer")){
            totalGrossReward = dancers * points * 0.95;
        } else if (location.equals("Bulgaria") && season.equals("winter")){
            totalGrossReward = dancers * points * 0.92;
        } else if (location.equals("Abroad") && season.equals("summer")){
            totalGrossReward = dancers * points * 1.5 * 0.9;
        } else {
            totalGrossReward = dancers * points * 1.5 * 0.85;
        }

        double charityMoney = totalGrossReward * 0.75;
        double moneyPerDancer = (totalGrossReward - charityMoney) / dancers;

        System.out.printf("Charity - %.2f\n", charityMoney);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);

    }
}
