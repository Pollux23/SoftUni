package FUND.P09Ex;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine()); //N
        int distance = Integer.parseInt(scanner.nextLine()); //M
        int exhaustionFactor = Integer.parseInt(scanner.nextLine()); //Y

        //повтаряме: poke
        //stop: power < distance
        //continue: power >= distance

        int count = 0; //брой на poke
        int startPower = power; //първоначалната си сила
        while (power >= distance) {
            power -= distance;
            //POKE
            count++;

            //проверка дали съм на половината от първоначалните си сили
            if (power == startPower * 0.5) {
                if (exhaustionFactor > 0) {
                    power = power / exhaustionFactor;
                    //power /= exhaustionFactor;
                }
            }
        }

        System.out.println(power);
        System.out.println(count);
    }
}
