package december.P04ForLoop;

import java.util.Scanner;

public class P02NumbersN1to1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = n; number >=1; number--){
            System.out.println(number);
        }


    }
}
