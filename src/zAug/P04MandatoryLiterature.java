package zAug;

import java.util.Scanner;

public class P04MandatoryLiterature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pageTotal = Integer.parseInt(sc.nextLine());
        int pagePerHr = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        // calculations

        int totalTimePerBook = pageTotal / pagePerHr;
        int hrsPerDay = totalTimePerBook / days;

        //print

        System.out.println(hrsPerDay);


        //За лятната ваканция в спикъка със задължителна литература на Жоро има определен
        //брой книги, но Жоро предпочита да играе с приятели навън. Вашата задача е да
        //помогнете на Жоро да изчисли колко часа на ден трябва да отделя, за да прочете
        //необходимата литература, но и да прекарва максимално време навън.
        //Вход
        //От конзолата се четат 3 реда:
        //    1. Брой страници в текущата книга – цяло число в интервала [1…1000];
        //    2. Страници, които може да прочита за 1 час – цяло число в интервала [1…1000];
        //    3. Броя на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000];
        //Изход
        //Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.
        //Вход
        //Изход
        //Обяснения
        //212
        //20
        //2
        //5
        //1. изчисляваме общото време за четене на книгата: 212 / 20 = 10 часа
        //2. получения резултат делим на броя дни, за да получим необходимите часове на ден: 10 часа / 2 дни = 5 часа на ден
        //
        //
        //Вход
        //Изход
        //
        //432
        //15
        //4
        //7
    }
}
