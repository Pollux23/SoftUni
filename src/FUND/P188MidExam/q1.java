package FUND.P188MidExam;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int biscuitNum = Integer.parseInt(scanner.nextLine());
        int workersNum = Integer.parseInt(scanner.nextLine());
        int biscuitNumCompeting = Integer.parseInt(scanner.nextLine());

        double biscuitPerMonth = (biscuitNum * workersNum) * 20 + (biscuitNum * workersNum * 0.75) * 10;

        double percentDiff = (biscuitPerMonth - biscuitNumCompeting) / biscuitNumCompeting * 100;

        if (biscuitPerMonth > biscuitNumCompeting) {
            System.out.printf("You have produced %.0f biscuits for the past month.", biscuitPerMonth);

            System.out.println();
            System.out.printf("You produce %.2f percent more biscuits.", percentDiff);


        } else {
            System.out.printf("You have produced %.0f biscuits for the past month.", biscuitPerMonth);
            System.out.println();
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(percentDiff));


        }




    }
}
