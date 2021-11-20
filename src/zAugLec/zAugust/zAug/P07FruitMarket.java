package zAugLec.zAugust.zAug;

import java.util.Scanner;

public class P07FruitMarket {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //scanner entries

        double cenaqgodizakg = Double.parseDouble(sc.nextLine());
        double bananas = Double.parseDouble(sc.nextLine());
        double oranges = Double.parseDouble(sc.nextLine());
        double blueberries = Double.parseDouble(sc.nextLine());
        double qgodi = Double.parseDouble(sc.nextLine());



        //calculations

       double cenamalini = cenaqgodizakg * 0.5;
       double cenaportokali = cenamalini * 0.6;
       double cenababani = cenamalini * 0.2;

        double totalSum = qgodi * cenaqgodizakg + bananas * cenababani + oranges * cenaportokali + blueberries * cenamalini;

        System.out.printf("%.2f", totalSum);

      // Мария решава да мине на диета и отива до близкия пазар, за да купи ягоди, банани, портокали и малини. На конзолата се въвежда цената на ягодите в лв./кг. и количеството на бананите, портокалите, малините и ягодите, които трябва да закупи. Да се напише програма, която пресмята колко пари са ѝ необходими, за да плати сметката, като знаете, че:
        //    • цената на малините е с 50% по-ниска от тази на ягодите;
        //    • цената на портокалите е с 40% по-ниска от цената на малините;
        //    • цената на бананите е с 80% по-ниска от цената на малините.
        //Вход
        //От конзолата се четат 5 реда:
        //    1. Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        //    2. Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
        //    3. Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
        //    4. Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
        //    5. Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]


    }
}
