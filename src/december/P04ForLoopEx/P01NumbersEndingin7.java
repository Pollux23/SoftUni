package december.P04ForLoopEx;

import java.util.Scanner;

public class P01NumbersEndingin7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 1000; i++ ){
            if (i % 10 == 7){          // prints all the numbers ending in 7 ( seven) from 1 to 1000
                System.out.println(i);
            }
        }
    }
}
