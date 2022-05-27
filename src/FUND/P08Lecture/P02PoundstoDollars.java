package FUND.P08Lecture;

import java.util.Scanner;

public class P02PoundstoDollars {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        //float pound = Float.parseFloat(scanner.nextLine());
       // float usd = pound * 1.36f;
       // System.out.printf("%.3f", usd);


        double pound = Double.parseDouble(scanner.nextLine());
        double usd = pound * 1.36;

        System.out.printf("%.3f", usd);

    }
}
