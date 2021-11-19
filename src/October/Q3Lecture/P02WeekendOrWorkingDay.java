package October.Q3Lecture;

import java.util.Scanner;

public class P02WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*

        Напишете програма която, чете ден от седмицата (текст), на английски език
         - въведен от потребителя. Ако денят е работен отпечатва на конзолата -
         "Working day", ако е почивен - "Weekend". Ако се въведе текст различен от ден от седмицата да се отпечата - "Error".

         */


        String input = scanner.nextLine();
        switch (input) {
            case "Monday":
                System.out.println("Working day");
                break;
            case "Tuesday":
                System.out.println("Working day");
                break;
            case "Wednesday":
                System.out.println("Working day");
                break;
            case "Thursday":
                System.out.println("Working day");
                break;
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }


    }
}
