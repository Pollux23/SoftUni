package decemberFirstSteps.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {


        //  https://prnt.sc/259jfmr

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int ticketPrice = 0;

        if (day.equals("Monday")) {
            ticketPrice = 12;
        } else if (day.equals("Tuesday")) {
            ticketPrice = 12;
        } else if (day.equals("Wednesday")) {
            ticketPrice = 14;
        } else if (day.equals("Thursday")) {
            ticketPrice = 14;
        } else if (day.equals("Friday")) {
            ticketPrice = 12;
        } else if (day.equals("Saturday")) {
            ticketPrice = 16;
        }else if (day.equals("Sunday")){
            ticketPrice = 16;
        }
        System.out.println(ticketPrice);

    }
}
