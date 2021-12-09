package december.P02Proverki_a_Lecture;

import java.util.Scanner;

public class P05Number10to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        if (inputNum < 100) {
            System.out.println("Less than 100");
        } else if (inputNum <= 200)
            System.out.println("Between 100 and 200");
        else
            System.out.println("Greater than 200");

    }
    }




