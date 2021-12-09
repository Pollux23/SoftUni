package december.P01FirstSteps_b_Ex;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylonSqMeters = Integer.parseInt(scanner.nextLine());
        int paintSqMeters = Integer.parseInt(scanner.nextLine());
        int paintThinnerSqMeters = Integer.parseInt(scanner.nextLine());
        int hrsNeeded = Integer.parseInt(scanner.nextLine());

        double nylonPrice = 1.50;
        double paintPrice = 14.50;
        double thinnerPrice = 5.00;


        double nylonCost = (nylonSqMeters +2) * 1.5;
        double paintCost = (paintSqMeters * paintPrice) *  (paintSqMeters * 0.10);
        double thinnerCost = paintThinnerSqMeters * thinnerPrice;
        double torbe = 0.40;

        double materialCost = nylonCost + paintCost + thinnerCost + torbe;
        double repairCost = (materialCost * 0.30) * hrsNeeded;
        double all = repairCost + materialCost;

        System.out.println(all);





    }
}
