package October.Q1Ex.moreexercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vegetablesPricePerKilo = Double.parseDouble(scanner.nextLine());
        double fruitsPricePerKilo = Double.parseDouble(scanner.nextLine());
        int vegetablesKg = Integer.parseInt(scanner.nextLine());
        int fruitsKg = Integer.parseInt(scanner.nextLine());


        double vegetablkesSum = vegetablesPricePerKilo * vegetablesKg;
        double fruitsSum = fruitsPricePerKilo * fruitsKg;
        double altogether = vegetablkesSum + fruitsSum;
        altogether = altogether / 1.94;
        System.out.printf("%.2f", altogether);



      /*  int  vegetablesKiloSum = Integer.parseInt(scanner.nextLine());
        int fruitsKiloSum = Integer.parseInt(scanner.nextLine());

          vegetablesKiloSum = (int) (0.194 * vegetablesPricePerKilo);
          fruitsKiloSum = (int) (19.40 * vegetablesPricePerKilo);

          double totalSum = vegetablesKiloSum  +   fruitsKiloSum;
        System.out.println(totalSum);
       */

    }
}
