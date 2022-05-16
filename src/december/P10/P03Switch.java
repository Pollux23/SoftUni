package december.P10;

import java.util.Scanner;

public class P03Switch {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String item = scanner.nextLine();
        int numberOfItems = scanner.nextInt();

        double total;

        switch (country) {
            case "Argentina":
                switch (item) {
                    case "flags":
                        total = numberOfItems * 3.25;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "caps":
                        total = numberOfItems * 7.2;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "posters":
                        total = numberOfItems * 5.1;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "stickers":
                        total = numberOfItems * 1.25;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                }
                break;
            case "Brazil":
                switch (item) {
                    case "flags":
                        total = numberOfItems * 4.2;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "caps":
                        total = numberOfItems * 8.5;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "posters":
                        total = numberOfItems * 5.35;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "stickers":
                        total = numberOfItems * 1.20;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                }
                break;
            case "Croatia":
                switch (item) {
                    case "flags":
                        total = numberOfItems * 2.75;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "caps":
                        total = numberOfItems * 6.9;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "posters":
                        total = numberOfItems * 4.95;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "stickers":
                        total = numberOfItems * 1.1;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                }
                break;
            case "Denmark":
                switch (item) {
                    case "flags":
                        total = numberOfItems * 3.1;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "caps":
                        total = numberOfItems * 6.5;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "posters":
                        total = numberOfItems * 4.8;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    case "stickers":
                        total = numberOfItems * 0.9;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfItems, item, country, total);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                }
                break;
            default:
                System.out.println("Invalid country!");
        }

    }
}