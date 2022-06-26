package decemberFirstSteps.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        // Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст)
        // - въведени от потребителя и проверява дали офисът на фирма е отворен,
        // като работното време на офисът е от 10-18 часа, от понеделник до събота включително

        if (time >= 10 && time <= 18) {
//            switch (day) {
//                case "Monday":
//                    System.out.println("open");
//                    break;
//                case "Tuesday":
//                    System.out.println("open");
//                    break;
//                case "Wednesday":
//                    System.out.println("open");
//                    break;
//                case "Thursday":
//                    System.out.println("open");
//                    break;
//                case "Friday":
//                    System.out.println("open");
//                    break;
//                case "Saturdyay":
//                    System.out.println("open");
//                    break;
//                case "Sunday":
//                    System.out.println("closed");
//
//            }
            if(day.equals("Sunday")){
                System.out.println("closed");
            } else {
                System.out.println("open");
            }

        } else {
            System.out.println("closed");

        }
    }
}
