package december.P04ForLoopLab;

import java.util.Scanner;

public class P03NumbersNto1over3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // отпечатват се числа от 1 до N през 3
        // начало : 1
        // край : N -- въведен от конзолата



        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n ; number +=3) {
            System.out.println(number);

        }

    }
}
