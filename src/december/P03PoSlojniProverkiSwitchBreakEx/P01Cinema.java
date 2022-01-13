package december.P03PoSlojniProverkiSwitchBreakEx;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        int totalSeats = rows * columns;
        double finalprice = totalSeats * price;

        if (projection.equals("Premiere")) {
            finalprice =rows * columns * 12;
        } else if (projection.equals("Normal")) {
           finalprice = rows * columns * 7.5;
        } else if (projection.equals("Discount")) {
            finalprice = rows * columns * 5;
        }

        System.out.printf("%.2f", finalprice);
    }
}
