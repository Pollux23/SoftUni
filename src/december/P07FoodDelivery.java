package december;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegMenus = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegMenuPrice = 8.15;

        double menuPrice = (chickenMenus * chickenMenuPrice) + (fishMenus * fishMenuPrice) + (vegMenus * vegMenuPrice);

        double desertPrice = menuPrice * 0.2;

        double delivery = 2.50;

        double cost = menuPrice + desertPrice + delivery;

        System.out.println(cost);




    }
}
