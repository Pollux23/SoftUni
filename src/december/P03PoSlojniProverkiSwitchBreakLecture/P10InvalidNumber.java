package december.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
//https://prnt.sc/259npqc
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        boolean isValid = (num >= 100) && (num <= 200) || (num == 0);
        if (!isValid) {
            System.out.println("invalid");




        }
    }
}
