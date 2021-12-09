package december.P02Proverki_a_Lecture;

import java.util.Scanner;

public class P02GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (a<b) {
            System.out.println(b);
        }else  {
            System.out.println(a);
        }
    }
}
