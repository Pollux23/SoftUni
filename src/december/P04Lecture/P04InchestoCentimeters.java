package december.P04Lecture;

import java.util.Scanner;

public class P04InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int inch = Integer.parseInt(scanner.nextLine());

        double cm = inch * 2.54;

        System.out.println(cm);


    }
}