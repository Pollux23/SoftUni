package december.P10;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shiro4inaKorab = Double.parseDouble(scanner.nextLine());
        double daljinaKorab = Double.parseDouble(scanner.nextLine());
        double viso4inaKorab = Double.parseDouble(scanner.nextLine());
        double astronautsAvergaeHeight = Double.parseDouble(scanner.nextLine());


        double raketaObem = shiro4inaKorab * daljinaKorab * viso4inaKorab;
        double staqObem = (astronautsAvergaeHeight + 0.40) * 2 * 2;
        double astronauts = Math.floor(raketaObem / staqObem);

        if (astronauts >= 3 && astronauts <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.", astronauts);
        }else if (astronauts < 3){
            System.out.printf("The spacecraft is too small.");

        }else{
            System.out.printf("The spacecraft is too big.");
        }


    }
}
