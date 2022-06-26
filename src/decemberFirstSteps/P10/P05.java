package decemberFirstSteps.P10;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodBoughtInKg = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int foodEatedInGr = 0;
        double foodAll = 0;

        while (!command.equals("Adopted")) {
            foodEatedInGr = scanner.nextInt();
            foodAll += foodEatedInGr;
        }

    }
}
