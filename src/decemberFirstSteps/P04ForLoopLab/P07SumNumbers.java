package decemberFirstSteps.P04ForLoopLab;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // броя на числата
        //всяко число от първото до последното (n)
        //повтаряме: прочитаме стойността на числото + сумираме
        //начало: първото число (1)
        //край: последно число (n)
        //промяна: +1
        int sum = 0;

        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value; // sum = sum + value;

        }
        System.out.println(sum);
    }
}
