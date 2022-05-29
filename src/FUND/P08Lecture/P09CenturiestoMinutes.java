package FUND.P08Lecture;

import java.util.Scanner;

public class P09CenturiestoMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int century = Integer.parseInt(scanner.nextLine());
        byte centuries = Byte.parseByte(scanner.nextLine());
        int years = centuries * 100;
        double days = years * 365.2422;
        double hrs = days * 24;
        double minutes = hrs * 60;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes",
                centuries, years, days, hrs, minutes);


    }
}
