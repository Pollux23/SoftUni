package decemberFirstSteps.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P12TRadeComissionSwitchBreal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        boolean isValidSales = false;
        boolean isValidTown = false;

        switch (town) {
            case "Sofia":
                isValidTown = true;
                if (sales <= 500) {
                    commission = sales * 5 / 100;
                } else if (sales <= 1000) {
                    commission = sales * 7 / 100;
                } else if (sales <= 10000) {
                    commission = sales * 8 / 100;
                } else if (sales > 10000) {
                    commission = sales * 12 / 100;
                }
                break;
            case "Varna":
                isValidTown = true;
                if (sales <= 500) {
                    commission = sales * 4.5 / 100;
                } else if (sales <= 1000) {
                    commission = sales * 7.5 / 100;
                } else if (sales <= 10000) {
                    commission = sales * 10 / 100;
                } else if (sales > 10000) {
                    commission = sales * 13 / 100;
                }

                break;
            case "Plovdiv":
                isValidTown = true;
                if (sales <= 500) {
                    commission = sales * 5.5 / 100;
                } else if (sales <= 1000) {
                    commission = sales * 8 / 100;
                } else if (sales <= 10000) {
                    commission = sales * 12 / 100;
                } else if (sales > 10000) {
                    commission = sales * 14.5 / 100;
                }
                break;
            default:
                isValidTown = false;

        }
        if (sales > 0) {
            isValidSales = true;
        }
        if (isValidTown && isValidSales) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }

    }
}

