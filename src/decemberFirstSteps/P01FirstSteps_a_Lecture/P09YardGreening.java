package decemberFirstSteps.P01FirstSteps_a_Lecture;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sqMetersGreen = Double.parseDouble(scanner.nextLine());

        double sqMeterPrice = 7.61;
        double finalPrice = sqMetersGreen * sqMeterPrice;
        double discount = finalPrice * 0.18;

        /*
        or
        double discount = finalPrice *18/100
         */
        double grandTotal = finalPrice - discount;



        System.out.printf("The final price is:%.2f%n",grandTotal);
        System.out.printf("The discount is:%.2f", discount);

    }
}
