package Q1Ex;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());


double nylonSum = (nylon + 2) * 1.50;
double paintSum = paint * 1.10 * 14.50;
double paintThinnerSum= paintThinner * 5;
double materials = nylonSum + paintSum + paintThinnerSum + 0.4;
double workersSum = materials * 0.30 * hours;

double total = materials + workersSum;
        System.out.println(total);





        /*double totalMaterials = ( nylonSquareMeters * 1.50 ) + ( paintLitersPerSquareMeter * 14.50 ) + ( thinnerLiters * 5);
        double additionalExpenses = totalMaterials + (paintLitersPerSquareMeter * 1.1) + (nylonSquareMeters *2 ) + 0.40;
        double oneHourwork = totalMaterials * 1.3;

        double altogether = totalMaterials + additionalExpenses + oneHourwork;

        System.out.println(altogether);


        /*
        Румен иска да пребоядиса хола и за целта е наел майстори. Напишете програма, която изчислява разходите за ремонта, предвид следните цени:
    • Предпазен найлон - 1.50 лв. за кв. метър
    • Боя - 14.50 лв. за литър
    • Разредител за боя - 5.00 лв. за литър
За всеки случай, към необходимите материали, Румен иска да добави още 10% от количеството боя и 2 кв.м. найлон, разбира се и 0.40 лв. за торбички.
 Сумата, която се заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.
 Входът се чете от конзолата и съдържа точно 4 реда:
    1. Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
    2. Необходимо количество боя (в литри) - цяло число в интервала [1…100]
    3. Количество разредител (в литри) - цяло число в интервала [1…30]
    4. Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
         */






    }
}
