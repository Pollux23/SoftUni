package October.Q2Ex;

import java.util.Scanner;

public class P05ToyShop {
    public static void main(String[] args) {

        /*
        Петя има магазин за детски играчки. Тя получава голяма поръчка, която трябва да изпълни. С парите, които ще спечели иска да отиде на екскурзия.
     Цени на играчките:
    • Пъзел - 2.60 лв.
    • Говореща кукла - 3 лв.
    • Плюшено мече - 4.10 лв.
    • Миньон - 8.20 лв.
    • Камионче - 2 лв.
    Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
    От спечелените пари Петя трябва да даде 10% за наема на магазина.
    Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.
    Вход
От конзолата се четат 6 реда:
    1. Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
    2. Брой пъзели - цяло число в интервала [0… 1000]
    3. Брой говорещи кукли - цяло число в интервала [0 … 1000]
    4. Брой плюшени мечета - цяло число в интервала [0 … 1000]
    5. Брой миньони - цяло число в интервала [0 … 1000]
    6. Брой камиончета - цяло число в интервала [0 … 1000]
Изход
На конзолата се отпечатва:
    • Ако парите са достатъчни се отпечатва:
        ◦ "Yes! {оставащите пари} lv left."
    • Ако парите НЕ са достатъчни се отпечатва:
        ◦ "Not enough money! {недостигащите пари} lv needed."

Резултатът трябва да се форматира до втория знак след десетичната запетая.
         */
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalProfit = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
//        Ако поръчаните играчки са 50 или повече
//        магазинът прави отстъпка 25% от общата цена.
        int toysCount = puzzles + dolls + bears + minions + trucks;
        if (toysCount >= 50) {
            totalProfit = totalProfit - totalProfit * 0.25;
        }
        // Петя трябва да даде 10% за наема на магазина
        totalProfit = totalProfit - totalProfit * 0.10;
        // or totalProfit *= 0.75;
        // or totalProfit = totalProfit * 0.75
        if (totalProfit >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", totalProfit - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - totalProfit);
        }
    }
}