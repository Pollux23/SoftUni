package zAugust.zAug;

import java.util.Scanner;

public class P01USDTOBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Прочитане на вход
        double usd = Double.parseDouble(sc.nextLine());
        //Конвертиртане на доларите в лева
        double bgn = usd * 1.79549;
        System.out.println(bgn);













    }
}
