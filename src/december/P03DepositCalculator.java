package december;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestPerYear = Double.parseDouble(scanner.nextLine());



        // сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        // http://i.imgur.com/2EoQb3o.png

        //double interestPerMonth = depositSum * (interest / 100) / 12;
        //double totalSum = depositSum + months * interestPerMonth;
        //System.out.println(totalSum);

       double apy = depositSum * (interestPerYear / 100);
       double interestPerMonth = apy / 12;
       double totalSum = depositSum + months * interestPerMonth;

        System.out.println(totalSum);

    }
}
