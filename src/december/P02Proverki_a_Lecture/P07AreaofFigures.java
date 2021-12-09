package december.P02Proverki_a_Lecture;

import java.util.Scanner;

public class P07AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String inputFigure = scanner.nextLine();

        double area = 0.0;

        if (inputFigure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;

        } else if (inputFigure.equals("rectangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            area = b * c;


        } else if (inputFigure.equals("circle")) {
            double d = Double.parseDouble(scanner.nextLine());
            area = Math.PI * d * d;


        } else if (inputFigure.equals("triangle")) {
            double e = Double.parseDouble(scanner.nextLine());
            double f = Double.parseDouble(scanner.nextLine());
            area = e * f / 2;

            System.out.printf("%.3f" , area);

        }

    }
}
