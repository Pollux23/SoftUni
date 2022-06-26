package decemberFirstSteps.P02ProverkiEx;

import java.util.Scanner;

public class P03Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (hour * 60) + minutes + 15;

        int newHour = allMinutes / 60;
        int newMin = allMinutes % 60;

        if (newHour>23){
            newHour = 0;
            System.out.printf("%d:%02d", newHour, newMin);
        }else {


            System.out.printf("%d:%02d", newHour, newMin);
        }




    }

    public static class P05GodzillavsKong {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            int people = Integer.parseInt(scanner.nextLine());
            double priceOneSuit = Double.parseDouble(scanner.nextLine());

            double decorSum = budget * 0.1;
            double sumSuit = people * priceOneSuit;

            if (people > 150) {
                sumSuit = sumSuit * 0.9;
            }

            double totalSum = decorSum + sumSuit;

            double diff = Math.abs(totalSum - budget);
            if (totalSum <= budget) {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", diff);
            } else {
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", diff);
            }


        }
    }
}
