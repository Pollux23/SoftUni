package zAug;

import java.util.Scanner;

public class P08FishTankacuarium {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int lenght  = Integer.parseInt(sc.nextLine());
        int width  = Integer.parseInt(sc.nextLine());
        int height  = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());


        // calculations

        double volumeInCm = lenght * width * height;
        double volumeLiters = volumeInCm * 0.001;
        volumeLiters = volumeLiters - volumeLiters * percent / 100;
        System.out.printf("%.2f", volumeLiters);

          //За рождения си ден Любомир получил аквариум с формата на паралелепипед. Първоначално прочитаме от конзолата на отделни редове размерите му
        // – дължина, широчина и височина в сантиметри. Трябва да се пресметне колко литра вода ще събира аквариума, ако се знае,
        // че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа.
        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
        //Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.
        //Вход
        //От конзолата се четат 4 реда:
        //    1. Дължина в см – цяло число в интервала [10 … 500]
        //    2. Широчина в см – цяло число в интервала [10 … 300]
        //    3. Височина в см – цяло число в интервала [10… 200]
        //    4. Процент  – реално число в интервала [0.000 … 100.000]
        //Изход
        //Да се отпечата на конзолата едно число:
        //    • литрите вода, които ще  събира аквариума.
        //Резултатът да се форматира до втората цифра след десетичната запетая.
        //Примерен вход и изход
        //Вход
        //Изход
        //Обяснения
        //85
        //75
        //47
        //17
        //248.69
        //Изчисляваме обема на аквариума:
        //обем на аквариум= 85*75*47=299625 см3
        //общо литри, които ще събере: 299625 * 0.001=299.625 литра
        //процент: 17*0.01=0.17
        //литрите, които реално ще трябват : 299.625*(1-0.17) = 248.68875 литра
        //Вход
        //Изход
        //
        //105
        //77
        //89
        //18.5
        //586.45

















    }
}
