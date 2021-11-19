package October.Q1Ex.moreexercises;

import java.util.Scanner;

public class P08CirclePerimeterandArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area =  Math.PI * (r*r);
        double perimeter = 2 * Math.PI * r;


        //System.out.printf("%.2f\n", area );   -- souf prints 2f in new line method 1

        // -- souf prints 2f in new line method 2
       System.out.printf("%.2f%n", area );
        System.out.printf("%.2f%n", perimeter);



       // System.out.println(String.format("%.2f", area));
        //System.out.println(String.format("%.2f",perimeter));
        // prints 2f with sout




    }
}
