package decemberFirstSteps.P03PoSlojniProverkiSwitchBreakEx;

import java.util.Scanner;

public class P01CinemaSwitchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * columns;
        double price = 0.0;
        double finalPrice = totalSeats * price;

        switch (projection) {
            case "Premiere":
                finalPrice = rows * columns * 12;
                break;
            case "Normal":
                finalPrice = rows * columns * 7.5;
                break;
            case "Discount":
                finalPrice = rows * columns * 5;
                break;
            default:

        }

        System.out.printf("%.2f", finalPrice);
    }
}
