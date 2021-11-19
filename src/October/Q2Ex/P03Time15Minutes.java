package October.Q2Ex;

import java.util.Scanner;

public class P03Time15Minutes {
    public static void main(String[] args) {
/*
     Да се напише програма, която чете час и минути от 24-часово денонощие,
     въведени от потребителя и изчислява колко ще е часът след 15 минути.
     Резултатът да се отпечата във формат часове:минути. Часовете винаги са между 0 и 23,
     а минутите винаги са между 0 и 59. Часовете се изписват с една или две цифри.
     Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.
 */


        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = hour * 60 + minutes + 15;
        int hours = allMinutes / 60;
        int newMinutes = allMinutes % 60;

        if (hours == 24) {
            hours = 0;
        }

        if (newMinutes < 10) {
            System.out.printf("%d:%02d%n", hours, newMinutes);
        } else {
            System.out.printf("%d:%d%n", hours, newMinutes);
        }
    }
}
