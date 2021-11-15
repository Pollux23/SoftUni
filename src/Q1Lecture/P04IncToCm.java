package Q1Lecture;

import java.util.Scanner;

public class P04IncToCm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());

        double cm = inch * 2.54;

        System.out.println(cm);

        // OR
        // package com.company;
        //
        //import java.util.Scanner;
        //
        //public class P04InchestoCentimeters {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        String input =  scanner.nextLine();
        //        double inch = Double.parseDouble(input);
        //
        //        double cm = inch * 2.54;
        //        System.out.println(cm);
        //
        //    }
        //}

        //Да се напише програма, която чете от конзолата реално число и го преобразува от инчове в сантиметри.
        // За целта умножете инчовете по 2.54 (1 инч = 2.54 сантиметра).

    }
}
