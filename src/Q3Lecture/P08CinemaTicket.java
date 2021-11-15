package Q3Lecture;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {


        // Да се напише програма която чете ден от седмицата (текст) – въведен от потребителя и принтира на конзолата цената на билет за кино според деня от седмицата:
        // http://i.imgur.com/vdJzNqQ.png

        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();



        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tueday") || dayOfWeek.equals("Friday")){
            System.out.println(12);
        }else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")){
            System.out.println(14);
        }else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            System.out.println(16);
        }


    }
}
