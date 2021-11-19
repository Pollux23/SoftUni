package October.Q1Ex.moreexercises;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        double triangleArea = (side * height ) / 2;
        //System.out.println(triangleArea);
       System.out.printf("%.2f", triangleArea);



    }
}
