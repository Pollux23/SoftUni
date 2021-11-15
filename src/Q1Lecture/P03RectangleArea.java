package Q1Lecture;


import java.util.Scanner;

public class P03RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = a * b;
        System.out.println(area);


        //double a = Double.parseDouble(scanner.nextLine());
        //double b = Double.parseDouble(scanner.nextLine());

        //double area = a * b;

        //System.out.println(area);
        // the output of this will be the area plus .0  --> because using double

    }
}
