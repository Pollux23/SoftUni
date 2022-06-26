package decemberFirstSteps.P01FirstSteps_b_Ex;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesCurrentBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHr = Integer.parseInt(scanner.nextLine());
        int daysNeeded = Integer.parseInt(scanner.nextLine());

        int timeNeededForOneBook = pagesCurrentBook / pagesPerHr;
        int hrsPerDayneeded = timeNeededForOneBook / daysNeeded;

        System.out.println(hrsPerDayneeded);


    }
}
