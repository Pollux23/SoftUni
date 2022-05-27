package FUND.P06EX;

import java.util.Scanner;

public class P04WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        int sum = 0;
        int number = startNumber;
        while (number <= endNumber){
            System.out.print(number + " ");
            sum += number;
            number++;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
