package October.Q1Ex;

import java.util.Scanner;

public class P06RepaintingMine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylonSquareMeters = Integer.parseInt(scanner.nextLine());
        int paintLitersPerSquareMeter = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int workersHours = Integer.parseInt(scanner.nextLine());

        double totalMaterials = ( nylonSquareMeters * 1.50 ) + ( paintLitersPerSquareMeter * 14.50 ) + ( thinnerLiters * 5);
        double additionalExpenses = totalMaterials + (paintLitersPerSquareMeter * 1.1) + (nylonSquareMeters *2 ) + 0.40;
        double oneHourwork = totalMaterials * 1.3;

        double altogether = totalMaterials + additionalExpenses + oneHourwork;

        System.out.println(altogether);






    }
}
