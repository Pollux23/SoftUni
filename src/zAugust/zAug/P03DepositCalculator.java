package zAugust.zAug;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // прочитане на входа
        double depositSum =Double.parseDouble(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());
        double interestRate =Double.parseDouble(sc.nextLine());
        //изчисления
        double interestPerMonth = depositSum * (interestRate / 100) / 12;
        double totalSum = depositSum + months * interestPerMonth;
        System.out.println(totalSum);



        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        //принтиране на конзолата
        //От конзолата се четат 3 реда:
        //    1. Депозирана сума – реално число в интервала [100.00 … 10000.00];
        //    2. Срок на депозита(в месеци) – цяло число в интервала [1…12];
        //    3. Годишен лихвен процент – реално число в интервала [0.00 …100.00];







    }
}
