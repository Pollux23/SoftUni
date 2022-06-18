package FUND.P12Ex;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int train[] = new int[wagons];


        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());

        }



        int all = 0;

        for (int ime:train) {
            System.out.println(ime);
            all += ime;
        }

//        for (int i = 0; i < train.length; i++) {
//            System.out.print(train[i] + " ");
//            all += train[i];
//        }
        //System.out.println();
        // System.out.println(all);
        System.out.printf("%n%s", all);
    }
}
