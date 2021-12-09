package december.P02Proverki_b_Ex;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesNum = Integer.parseInt(scanner.nextLine());
        int dollsNum = Integer.parseInt(scanner.nextLine());
        int bearsNum = Integer.parseInt(scanner.nextLine());
        int minionsNum = Integer.parseInt(scanner.nextLine());
        int trucksNum = Integer.parseInt(scanner.nextLine());




        double totalPrice = puzzlesNum * 2.6 + dollsNum * 3 + bearsNum * 4.10 + minionsNum * 8.20 + trucksNum * 2;
        System.out.println(totalPrice);

        double toysNum = puzzlesNum +dollsNum + bearsNum + minionsNum + trucksNum;
        System.out.println(toysNum);

    }
}
