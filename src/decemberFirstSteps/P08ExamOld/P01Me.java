package decemberFirstSteps.P08ExamOld;

import java.util.Scanner;

public class P01Me {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         double avergaeSpeed = Double.parseDouble(scanner.nextLine());
         double litersPer100km = Double.parseDouble(scanner.nextLine());

         int bothWays = 384400 * 2;
         double timeneededBothWays = Math.ceil(bothWays / avergaeSpeed);
         double timeAll = timeneededBothWays + 3;
         double totalFuel = (litersPer100km * bothWays) / 100;

        //System.out.println(timeAll);
        //System.out.println((litersPer100km * bothWays) /100);

        System.out.printf("%.0f%n",timeAll);
        System.out.printf("%.0f", totalFuel);
    }
}
