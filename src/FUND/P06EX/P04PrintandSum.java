package FUND.P06EX;

import java.util.Scanner;

public class P04PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. начало на интервала -> цяло число (вход)
        int startNumber = Integer.parseInt(scanner.next());
        //2. край на интервала -> цяло число (вход)
        int endNumber = Integer.parseInt(scanner.next());
        //3. отпечатам числата [начало; край]
        //повтаряме: печатаме числото
        //начало: startNumber
        //край: endNumber
        //промяна: +1
        int sum = 0; //сума на числата
        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print(number + " ");
            sum += number; //sum = sum + number;
        }
        //4. отпечатам сумата
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}

