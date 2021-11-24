package december.P01FirstStepsEx;

import java.util.Scanner;

public class P09FishTankk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeLiters = volume / 1000;

        double spaceTaken = percent / 100;
        double litersNeeded = volumeLiters * (1 - spaceTaken);

        System.out.println(litersNeeded);




    }
}
