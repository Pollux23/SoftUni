package October.Q1Ex.moreexercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double houseHeight = Double.parseDouble(scanner.nextLine());
        double houseBigSideLength = Double.parseDouble(scanner.nextLine());
        double houseRoofHeight = Double.parseDouble(scanner.nextLine());

        double greenPaintPricePerLiter = 3.4;
        double redPaintPricePerLiter = 4.3;

        double housepaint = houseHeight * houseBigSideLength;
        housepaint = greenPaintPricePerLiter * houseHeight * houseBigSideLength;



    }
}
