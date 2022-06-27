package zFirstSteps.zAugust.zAug;

import java.util.Scanner;

public class P02RadiansToDegress {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Прочитане на вход
        double radians = Double.parseDouble(sc.nextLine());

        //нвертиране от радиани в градуси
        double degrees = radians * 180 / Math.PI;

        //printirane na konzolata
        System.out.printf("%.0f" , degrees);








    }
}
