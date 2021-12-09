package december.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P12TradeCommissionsIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        boolean isValidSales = sales > 0;

        if (town.equals("Sofia")) {
            if (sales <= 500) {
                commission = sales * 5 / 100;
            } else if (sales <= 1000) {
                commission = sales * 7 / 100;
            } else if (sales <= 10000) {
                commission = sales * 8 / 100;
            } else if (sales > 10000) {
                commission = sales * 12 / 100;
            }


        } else if (town.equals("Varna")) {
            if (sales <= 500) {
                commission = sales * 4.5 / 100;
            } else if (sales <= 1000) {
                commission = sales * 7.5 / 100;
            } else if (sales <= 10000) {
                commission = sales * 10 / 100;
            } else if (sales > 10000) {
                commission = sales * 13 / 100;
            }


        } else if (town.equals("Plovdiv")) {
            if (sales <= 500) {
                commission = sales * 5.5 / 100;
            } else if (sales <= 1000) {
                commission = sales * 8 / 100;
            } else if (sales <= 10000) {
                commission = sales * 12 / 100;
            } else if (sales > 10000) {
                commission = sales * 14.5 / 100;
            }


        }if (!isValidSales){
            System.out.println("error");


        }else

        {
            System.out.printf("%.2f", commission);
        }

    }

}

