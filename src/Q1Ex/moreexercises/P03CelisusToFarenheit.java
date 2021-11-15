package Q1Ex.moreexercises;

import java.util.Scanner;

public class P03CelisusToFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // (5°C × 9/5) + 32 = 41°F

        double celisusDegrees = Double.parseDouble(scanner.nextLine());

       double farenheitDegrees = (celisusDegrees * 9/5) + 32;

      // System.out.println(farenheitDegrees);
        System.out.printf("%.2f", farenheitDegrees);



        /*
        Напишете програма, която чете градуси по скалата на Целзий (°C) и ги преобразува до градуси по скалата на Фаренхайт (°F).
        Потърсете в Интернет подходяща формула, с която да извършите изчисленията.
        Форматирате изхода до ВТОРИЯ знак след десетичната запетая!!!.
        */


    }
}
