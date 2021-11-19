package October.Q1Ex;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {


        /*
        Джеси решава, че иска да се занимава с баскетбол, но за да тренира е нужна екипировка.
        Напишете програма, която изчислява какви разходи ще има Джеси, ако започне да тренира, като знаете колко е таксата за тренировки по баскетбол за период от 1 година.
        Нужна екипировка:


    • Баскетболни кецове – цената им е 40% по-малка от таксата за една година
    • Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
    • Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
    • Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
Вход
От конзолата се четe 1 ред:
    • Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]

         */


        Scanner scanner = new Scanner(System.in);

        int basketballTrainingCostPerYear = Integer.parseInt(scanner.nextLine());

        double basketShoes = basketballTrainingCostPerYear - basketballTrainingCostPerYear * 0.40;
        double basketEquipment =  basketShoes - basketShoes * 0.20;
        double basketBall = basketEquipment * 0.25;
        double basketAccessories =  basketBall / 5;

        double totalSum = basketShoes + basketEquipment + basketBall + basketAccessories + basketballTrainingCostPerYear;
        System.out.println(totalSum);








    }
}
