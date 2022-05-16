package december.P10;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintCasesCount = Integer.parseInt(scanner.nextLine());
        int tapetiRolkiCount = Integer.parseInt(scanner.nextLine());
        double glovesPrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());

        double priceForPaint = 21.5 * paintCasesCount;
        double priceForTapeti = 5.2 * tapetiRolkiCount;
        double glovesNeeded = Math.ceil(tapetiRolkiCount * 0.35);
        double brushesNeeded = Math.floor(paintCasesCount * 0.48);
        double glovesTotal = glovesNeeded * glovesPrice;
        double brushesTotal = brushesNeeded * brushPrice;

        double totalSum = priceForPaint + priceForTapeti + glovesTotal + brushesTotal;
        double deliveryPrice = totalSum / 15;

        System.out.printf("This delivery will cost %.2f lv.", deliveryPrice);

    }
}
