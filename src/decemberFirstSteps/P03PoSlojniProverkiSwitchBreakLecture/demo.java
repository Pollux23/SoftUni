package decemberFirstSteps.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num >= 5 && num <= 10 && num % 2 == 0 ){
            System.out.println("Valid");
        }else {
            System.out.println("Not Valid");
        }
    }
}
