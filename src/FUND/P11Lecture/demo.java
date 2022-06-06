package FUND.P11Lecture;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = new int[3];
        numbersArr[0] = 10;
        numbersArr[1] = 20;
        numbersArr[2] = 30;

        System.out.println(numbersArr[1]);   // prints the num on position 1 !

        for (int i = 0; i < numbersArr.length ; i++) {
            System.out.println(numbersArr[i]);
        }
    }
}
