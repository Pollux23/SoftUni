package december.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P11FruitShopBrata {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        boolean isValidDay = false;
        boolean isValidFruit = false;
        boolean isWeekday = false;
        boolean isWeekend = false;

        if (day.equals("Monday") || day.equals("Tuesday")
                || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            isWeekday = true;
            isValidDay = true;

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            isWeekend = true;
            isValidDay = true;
        } else {
            isValidDay = false;
        }

        switch (fruit) {
            case "banana":
                isValidFruit = true;
                if (isWeekday) {
                    price = quantity * 2.5;

                } else if (isWeekend) {
                    price = quantity * 2.7;
                }
                break;
            case "apple":
                isValidFruit = true;
                if (isWeekday) {
                    price = quantity * 1.2;

                } else if (isWeekend) {
                    price = quantity * 1.25;
                }
                break;
            case "orange":
                isValidFruit = true;
                if (isWeekday) {
                    price = quantity * 0.85;

                } else if (isWeekend) {
                    price = quantity * 0.9;
                }
                break;
            case "grapefruit":
                isValidFruit = true;
                if (isWeekday) {
                    price = quantity * 1.45;

                } else if (isWeekend) {
                    price = quantity * 1.6;
                }
                break;
            case "kiwi":
                isValidFruit = true;
                if (isWeekday) {
                    price = quantity * 2.7;

                } else if (isWeekend) {
                    price = quantity * 3;
                }
                break;
            case "pineapple":
                isValidFruit = true;
                if (isWeekday) {
                    price = quantity * 5.5;

                } else if (isWeekend) {
                    price = quantity * 5.6;
                }
                break;
            case "grapes":
                isValidFruit = true;
                if (isWeekday) {
                    price = quantity * 3.85;

                } else if (isWeekend) {
                    price = quantity * 4.2;
                }
                break;
            default:
                isValidFruit = false;
        }
        if (isValidFruit && isValidDay) {
            System.out.printf("%.2f", price);

        } else {
            System.out.println("error");
        }
    }
}