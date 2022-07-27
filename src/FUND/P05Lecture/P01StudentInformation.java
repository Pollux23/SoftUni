package FUND.P05Lecture;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String name = scanner.nextLine();
//        int age = Integer.parseInt(scanner.nextLine());
//        double grade = Double.parseDouble(scanner.nextLine());
//
//        System.out.printf("Name: %s, Age: %d, Grade: %.2f%n", name, age, grade);


        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double grade = scanner.nextDouble();

        System.out.printf("Name: %s, Age: %d, Grade: %.2f %n", name, age,grade);

    }
}
