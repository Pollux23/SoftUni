package december.P04xEx;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yearlyCost = Integer.parseInt(scanner.nextLine());

        double sneakers = yearlyCost - yearlyCost * 0.4; //sneakers = yearlyCost * 0.6;
        double outfit = sneakers - sneakers * 0.2; // outfit = sneakers * 0.8;
        double ball = outfit * 0.25; // double ball = outfit / 4;
        double accessories = ball * 0.2; //accessories = ball / 5;


        double all = yearlyCost + sneakers + outfit + ball + accessories;
        System.out.println(all);




    }
}
