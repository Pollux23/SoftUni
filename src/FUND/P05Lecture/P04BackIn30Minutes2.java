package FUND.P05Lecture;

import java.util.Scanner;

public class P04BackIn30Minutes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());


        int allminutes = (hours * 60) + minutes + 30;

         int hoursafter = allminutes / 60 ;
         int minutesafter = allminutes % 60;


        if (hoursafter > 23) {
            hoursafter = 0;
        }


        System.out.printf("%d:%02d", hoursafter, minutesafter);

    }
}
