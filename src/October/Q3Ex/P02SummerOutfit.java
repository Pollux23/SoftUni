package October.Q3Ex;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {

//Лято е с много променливо време и Виктор има нужда от вашата помощ.
// Напишете програма която спрямо времето от денонощието и градусите да препоръча на Виктор какви дрехи да си облече.
// Вашия приятел има различни планове за всеки етап от деня, които изискват и различен външен вид, тях може да видите от таблицата.
//От конзолата се четат точно два реда:
//    • Градусите - цяло число в интервала [10…42]
//    • Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"
        //http://i.imgur.com/56QSDQQ.png

        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        String shoes = "";
        String outfit = "";

        switch (dayTime) {
            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";


                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";

                } else if (degrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";


                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";

                } else if (degrees >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                ;
                break;
            case "Evening":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";


                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";

                } else if (degrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Moccasins";
                }
                break;


        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
