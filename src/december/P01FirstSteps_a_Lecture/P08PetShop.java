package december.P01FirstSteps_a_Lecture;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dogFoodNum = Integer.parseInt(scanner.nextLine());
        int catFoodNum = Integer.parseInt(scanner.nextLine());

        double total = ( dogFoodNum * 2.50) + ( catFoodNum * 4);

        System.out.println(total);



    }
}
