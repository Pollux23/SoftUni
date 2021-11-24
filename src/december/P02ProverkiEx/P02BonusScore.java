package december.P02ProverkiEx;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0.0;
        /*
        Ако числото е до 100 включително, бонус точките са 5.
        Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
         */
        if (number <= 100) {
            bonus = 5;
        } else if (number <= 1000) {
            bonus = number * 0.20;
        } else {
            bonus = number * 0.10;
        }

        /*
        	Допълнителни бонус точки (начисляват се отделно от предходните):
                За четно число  + 1 т.
                За число, което завършва на 5  + 2 т.
         */
        if (number % 2 == 0) {
            bonus += 1;
        }

        if (number % 10 == 5) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + number);

    }
}
