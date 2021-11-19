package October.Q1Ex;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());


        double volumeInCm = length * width * height;
        double volumeInLiters = volumeInCm * 0.001;
        volumeInLiters = volumeInLiters - volumeInLiters * percent / 100;
       // System.out.printf("%.2f", volumeInLiters);
        System.out.println(volumeInLiters);

    }
}
