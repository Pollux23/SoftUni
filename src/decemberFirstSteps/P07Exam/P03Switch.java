package decemberFirstSteps.P07Exam;

import java.util.Scanner;

public class P03Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dancers = Integer.parseInt(sc.nextLine());
        double points = Double.parseDouble(sc.nextLine());
        String season = sc.next();
        String location = sc.next();

        double totalGrossReward = 0;

        switch (location){
            case "Bulgaria":
                if (season.equals("summer")){
                    totalGrossReward = dancers * points * 0.95;
                } else if (season.equals("winter")){
                    totalGrossReward = dancers * points * 0.92;
                }
                break;
            case "Abroad":
                if (season.equals("summer")){
                    totalGrossReward = dancers * points * 1.5 * 0.9;
                } else if (season.equals("winter")){
                    totalGrossReward = dancers * points * 1.5 *0.85;
                }
                break;
            default:
                System.out.println("Invalid location!");
        }

        double charityMoney = totalGrossReward * 0.75;
        double moneyPerDancer = (totalGrossReward - charityMoney) / dancers;

        System.out.printf("Charity - %.2f\n", charityMoney);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);


    }

}

