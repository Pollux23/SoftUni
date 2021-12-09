package december.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class sdsdf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        boolean isWorkingHrs = false;
        boolean isWorkingDay;

        if (time >= 10 && time <= 18) {
            isWorkingHrs = true;

        }

        switch (day) {
            case "Monday":
                isWorkingDay = true;
                break;
            case "Tuesday":
                isWorkingDay = true;
                break;
            case "Wednesday":
                isWorkingDay = true;
                break;
            case "Thursday":
                isWorkingDay = true;
                break;
            case "Friday":
                isWorkingDay = true;
                break;
            case "Saturday":
                isWorkingDay = true;
                break;
            case "Sunday":
                isWorkingDay = false;
                break;
            default:
                isWorkingDay = false;
        }

        if (isWorkingHrs && isWorkingDay) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }

    }


}


