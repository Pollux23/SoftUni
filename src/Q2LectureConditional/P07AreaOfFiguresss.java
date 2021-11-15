package Q2LectureConditional;

import java.util.Scanner;

public class P07AreaOfFiguresss {
    public static void main(String[] args) {

        //Да се напише програма, в която потребителят въвежда вида и размерите на геометрична фигура и пресмята лицето й.
        // Фигурите са четири вида: квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle).
        // На първия ред на входа се чете вида на фигурата (текст със следните възможности: square, rectangle, circle или triangle).
        //    • Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
        //    • Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
        //    • Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
        //    • Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея
        //Резултатът да се закръгли до 3 цифри след десетичната запетая.


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

