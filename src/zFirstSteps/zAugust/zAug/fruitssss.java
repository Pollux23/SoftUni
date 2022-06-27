package zFirstSteps.zAugust.zAug;

import java.util.Scanner;

public class fruitssss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double qgodilv = Double.parseDouble(sc.nextLine());
        double banani = Double.parseDouble(sc.nextLine());
        double portokali = Double.parseDouble(sc.nextLine());
        double maliniKg = Double.parseDouble(sc.nextLine());
        double qgodiKg = Double.parseDouble(sc.nextLine());


        double cenamalini = qgodilv * 0.5;
        double cenaportokali = cenamalini * 0.6;
        double cenababani = cenamalini * 0.2;

        double totalsum = qgodiKg * qgodilv + banani * cenababani + portokali * cenaportokali + maliniKg *cenamalini;


        System.out.printf("%.2f" , totalsum);





    }
}
