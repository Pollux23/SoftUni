package Q3Ex;

import java.util.Scanner;

public class P05FishingBoat {

    //http://i.imgur.com/NTEAfIR.png
    // http://i.imgur.com/ItCKTBT.png

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanNum = Integer.parseInt(scanner.nextLine());

        double rent = 0.0;
        double discount = 0.0;
        switch (season) {
            case "Spring":
                rent = 3000;
                if (fishermanNum <= 6) {
                    discount = 0.10;
                } else if (fishermanNum <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;
            case "Autumn && Summer":
                rent = 4200;
                if (fishermanNum <= 6) {
                    discount = 0.10;
                } else if (fishermanNum <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;
            case "Winter":
                rent = 2600;
                if (fishermanNum <= 6) {
                    discount = 0.10;
                } else if (fishermanNum <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;

        }
        double neededMoney = rent - rent * discount;
        if (fishermanNum % 2 == 0 && !season.equals("Autumn")) {
            neededMoney *= 0.95;

        }
        System.out.println();
    }
}
