package decemberFirstSteps.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P02WeekendorWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
                // break is not needed after default but it is good to be added so we get used to the construction


        }


    }
}
