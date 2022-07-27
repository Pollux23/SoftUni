package FUND.P21ObjectsAndClasses;

import java.time.LocalDate;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int year = Integer.parseInt(scanner.nextLine());
int month = Integer.parseInt(scanner.nextLine());
int date = Integer.parseInt(scanner.nextLine());

 // obekt: LocalDate
        LocalDate birthday = LocalDate.of(year,month,date);

        System.out.println(birthday);

    }
}
