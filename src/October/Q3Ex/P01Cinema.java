package October.Q3Ex;

import java.util.Scanner;

public class P01Cinema {

    //   В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони. Има три вида прожекции с билети на различни цени:
    //    • Premiere – премиерна прожекция, на цена 12.00 лева.
    //    • Normal – стандартна прожекция, на цена 7.50 лева.
    //    • Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

    //    Напишете програма, която чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа),
    // въведени от потребителя, и изчислява общите приходи от билети при пълна зала.
    // Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.
    // http://i.imgur.com/5ti4oTh.png

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int totalSeats = r * c;
        double income = 0.0;

        switch (projection) {
            case "Premiere":
                income = totalSeats * 12;
                break;

            case "Normal":
                income = totalSeats * 7.50;
                break;

            case "Discount":
                income = totalSeats * 5;
                break;
        }
        System.out.printf("%.2f leva", income);


    }
}
