package december.P04ForLoopLab;

import java.util.Scanner;

public class P04EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // степени от 0 до N
        //Да се напише програма, която чете число n,
        // въведено от потребителя и печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n.

        for (int step = 0; step <= n; step += 2) {
            //System.out.println(Math.pow(2, step)); - the result will be in double - 1.0 / 2.0 etc
            System.out.printf("%.0f%n", Math.pow(2, step));
            //Шаблонът %.0f отпечатва десетичната дроб с нула знака след десетичната запетая
        }


    }
}
