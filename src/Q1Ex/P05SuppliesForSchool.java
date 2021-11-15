package Q1Ex;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPacks = Integer.parseInt(scanner.nextLine());
        int markerPacks = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());


        double totalNoDiscount = (penPacks * 5.80 ) + ( markerPacks * 7.20 ) + ( detergent * 1.20 );
        double totalWithDiscount = totalNoDiscount - discount * 1.0 /100 * totalNoDiscount;

        System.out.println(totalWithDiscount);






          //double totalsum = (penPacks1 + markerPacks1 +  detergent1);
         // double discount1 = totalsum / 100;





    }
}
