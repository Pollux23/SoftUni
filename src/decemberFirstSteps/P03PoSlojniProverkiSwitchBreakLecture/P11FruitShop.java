package decemberFirstSteps.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        boolean isvalidDay = false;
        boolean isValidFruit = false;


        switch (fruit) {

            case "banana":
                isValidFruit = true;
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    isvalidDay = true;
                    price = quantity * 2.5;

                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    isvalidDay = true;
                    price = quantity * 2.7;
                }
                break;
            case "apple":
                isValidFruit = true;
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    isvalidDay = true;
                    price = quantity * 1.2;

                } else if (day.equals("Saturday") || day.equals("Sunday"))
                    isvalidDay = true;
                price = quantity * 1.25;
                break;
            case "orange":
                isValidFruit = true;
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    isvalidDay = true;

                    price = quantity * 0.85;

                } else if (day.equals("Saturday") || day.equals("Sunday"))
                    isvalidDay = true;

                price = quantity * 0.9;
                break;
            case "grapefruit":
                isValidFruit = true;
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    isvalidDay = true;

                    price = quantity * 1.45;

                } else if (day.equals("Saturday") || day.equals("Sunday"))
                    price = quantity * 1.6;
                isvalidDay = true;

                break;
            case "kiwi":
                isValidFruit = true;
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    isvalidDay = true;

                    price = quantity * 2.7;

                } else if (day.equals("Saturday") || day.equals("Sunday"))
                    isvalidDay = true;

                price = quantity * 3;
                break;
            case "pineapple":
                isValidFruit = true;
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    isvalidDay = true;

                    price = quantity * 5.5;

                } else if (day.equals("Saturday") || day.equals("Sunday"))
                    price = quantity * 5.6;
                isvalidDay = true;

                break;
            case "grapes":
                isValidFruit = true;
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    isvalidDay = true;

                    price = quantity * 3.85;

                } else if (day.equals("Saturday") || day.equals("Sunday"))
                    isvalidDay = true;

                price = quantity * 4.2;
                break;
            default:
                isValidFruit = false;


        }

        if (isValidFruit && isvalidDay) {
            System.out.printf("%.2f", price);

        } else {
            System.out.println("error");

        }

    }
}