package FUND.P188MidExam;

import java.util.Scanner;

public class P1Me {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int employeeFirst = Integer.parseInt(scanner.nextLine());
        int employeeSecond = Integer.parseInt(scanner.nextLine());
        int employeeThird = Integer.parseInt(scanner.nextLine());


        int studentsPerHr = employeeFirst + employeeSecond + employeeThird;
        int remainingStudents = Integer.parseInt(scanner.nextLine());
        int hrsPassed = 0;
        while (remainingStudents > 0){
            hrsPassed ++;
            if (hrsPassed % 4 != 0){
                remainingStudents -= studentsPerHr;
            }
        }

        System.out.printf("Time needed: %dh.", hrsPassed);

    }
}
