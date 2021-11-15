package zAugLec;

import java.util.Scanner;

public class P06AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();

       if (input.equals("square")) {
           double squareSide = Double.parseDouble(scanner.nextLine());
           System.out.println(squareSide * squareSide);
       } else if ( input.equals("rectangle")) {
           double sideA = Double.parseDouble(scanner.nextLine());
           double sideB = Double.parseDouble(scanner.nextLine());
           System.out.printf("%.3f",sideA * sideB);

       } else if ( input.equals("circle")) {
           double circleRadius = Double.parseDouble(scanner.nextLine());
           System.out.printf("%.3f", Math.PI * circleRadius * circleRadius);
       } else if ( input.equals("triangle")) {
           double triangleSide = Double.parseDouble(scanner.nextLine());
           double triangleHeight = Double.parseDouble(scanner.nextLine());
           System.out.printf("%.3f" , (triangleHeight * triangleSide) / 2 );
       }

 // Да се напише програма, в която потребителят въвежда вида и размерите на геометрична фигура и пресмята лицето й. Фигурите са четири вида: квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle). На първия ред на входа се чете вида на фигурата (square, rectangle, circle или triangle). Ако фигурата е квадрат, на следващия ред се чете едно число - дължина на страната му. Ако фигурата е правоъгълник, на следващите два реда четат две числа - дължините на страните му. Ако фигурата е кръг, на следващия ред чете едно число - радиусът на кръга. Ако фигурата е триъгълник, на следващите два реда четат две числа - дължината на страната му и дължината на височината към нея. Резултатът да се закръгли до 3 цифри след десетичната точка.


    }
}
