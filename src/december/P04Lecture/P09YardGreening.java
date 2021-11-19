package december.P04Lecture;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sqMetersGreen = Double.parseDouble(scanner.nextLine());

        double sqMeterPrice = 7.61;
        double discount =sqMeterPrice * 0.82;
        double finalPrice = sqMetersGreen * sqMeterPrice;

    }
}
