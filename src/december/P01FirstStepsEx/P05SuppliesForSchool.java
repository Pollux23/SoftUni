package december.P01FirstStepsEx;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Учебната година вече е започнала и отговорничката на 10Б клас - Ани трябва да купи определен брой
        //пакетчета с химикали, пакетчета с маркери, както и препарат за почистване на дъска. Тя е редовна клиентка
        //на една книжарница, затова има намаление за нея, което представлява някакъв процент от общата сума.
        //Напишете програма, която изчислява колко пари ще трябва да събере Ани, за да плати сметката, като
        //имате предвид следния ценоразпис:
        //• Пакет химикали - 5.80 лв.
        //• Пакет маркери - 7.20 лв.
        //• Препарат - 1.20 лв (за литър)
        //Вход
        //От конзолата се четат 4 числа:
        // Брой пакети химикали - цяло число в интервала [0...100]
        // Брой пакети маркери - цяло число в интервала [0...100]
        // Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        // Процент намаление - цяло число в интервала [0...100]
        //Изход
        //Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.

        double pens = Double.parseDouble(scanner.nextLine());
        double markers = Double.parseDouble(scanner.nextLine());
        double detergentLiters = Double.parseDouble(scanner.nextLine());
        double discountPercent = Double.parseDouble(scanner.nextLine());

       // double totalNoDiscount = (pens *5.80) + (markers * 7.20) + (detergentLiters * 1.20);
        //double totalWithDiscount = totalNoDiscount - discountPercent * 1.0 / 100 * totalNoDiscount;
       // System.out.println(totalWithDiscount)
        double penPrice = 5.80;
        double markerPrice = 7.20;
        double detergentPrice = 1.20;

        double totalWithoutDiscount = (pens * penPrice) + (markers * markerPrice) + (detergentLiters*detergentPrice);
        double totalWithDiscount = totalWithoutDiscount - (totalWithoutDiscount * discountPercent/100);

        System.out.println(totalWithDiscount);


    }
}
