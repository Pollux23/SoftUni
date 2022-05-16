package december.P08ExamOld;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double averageSpeed = Double.parseDouble(scanner.nextLine());
        double fuelPer100Km = Double.parseDouble(scanner.nextLine());

        int earthToMoon = 384400;
        int layoutOnMoon = 3;
        int bothWays = earthToMoon * 2;
        double tripTime = Math.ceil(bothWays / averageSpeed);
        double totalTime = tripTime + layoutOnMoon;
        double totalFuel = (bothWays * fuelPer100Km) / 100;

        System.out.printf("%.0f%n", totalTime);
        System.out.printf("%.0f", totalFuel);

    }
}
