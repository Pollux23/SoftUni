package december.P01FirstSteps_b_Ex;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yearlyCost = Integer.parseInt(scanner.nextLine());

        double basketSneakers = yearlyCost * 0.4;
        double basketOutfit = basketSneakers * 0.2;
        double basketBall = basketSneakers * 0.25;
        double accessories = basketSneakers * 0.2;

        double all = yearlyCost + basketSneakers + basketOutfit + basketBall + accessories;
        System.out.println(all);




    }
}
