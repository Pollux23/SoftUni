package decemberFirstSteps.P07Exam;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String player = "";
        int maxGoals = 0;

        while (!input.equalsIgnoreCase("end")) {
            player = input;
            int currentGoals = Integer.parseInt(scanner.nextLine());
            if (currentGoals > maxGoals) {
                maxGoals = currentGoals;
            }
            input = scanner.nextLine();
        }

        System.out.printf("%s is the best player!\n", player);

        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
