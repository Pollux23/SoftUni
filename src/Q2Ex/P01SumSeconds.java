package Q2Ex;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {

        /*
        Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50).
         Да се напише програма, която чете времената на състезателите в секунди,
         въведени от потребителя и пресмята сумарното им време във формат "минути:секунди".
         Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35")
         */

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int allTimeInSeconds = first + second + third;
        int minutes = allTimeInSeconds / 60;
        int sec = allTimeInSeconds % 60;
        if (sec < 10){
            System.out.printf("%d:0%d", minutes, sec);
        }else {
            System.out.printf("%d:%d", minutes, sec);
        }
    }
}
