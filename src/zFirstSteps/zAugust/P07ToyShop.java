package zFirstSteps.zAugust;

import java.util.Scanner;

public class P07ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsNum = Integer.parseInt(scanner.nextLine());
        int teddyNum = Integer.parseInt(scanner.nextLine());
        int minionNum = Integer.parseInt(scanner.nextLine());
        int trucksNum = Integer.parseInt(scanner.nextLine());

        //Цени на играчките:
        //    • Пъзел - 2.60 лв.
        //    • Говореща кукла - 3 лв.
        //    • Плюшено мече - 4.10 лв.
        //    • Миньон - 8.20 лв.
        //    • Камионче - 2 лв

         double sum = (puzzleCount * 2.60) +
                (dollsNum * 3 ) +
                (teddyNum * 4.10) +
                (minionNum * 8.20) +
                (trucksNum * 2);

          int countalltoys = puzzleCount + dollsNum + teddyNum + minionNum + trucksNum;

          if (countalltoys >=50) {
              sum = sum * 0.75;

          }
          double sumAfterRent = sum * 0.9;

        if (holidayPrice >=sumAfterRent) {
            System.out.printf("Not enough money! %.2f" + " lv needed.", (holidayPrice - sumAfterRent));
        } else {
            System.out.printf("Yes! %.2f lv left.", (sumAfterRent - holidayPrice));
        }



    }
}


