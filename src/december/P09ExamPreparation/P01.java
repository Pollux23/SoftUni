package december.P09ExamPreparation;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberriesPriceInKg = Double.parseDouble(scanner.nextLine());
        double bananaVolumeInKg = Double.parseDouble(scanner.nextLine());
        double orangeVolumeInKg = Double.parseDouble(scanner.nextLine());
        double berriesVolumeInKg = Double.parseDouble(scanner.nextLine());
        double strawberriesVolumeInKg = Double.parseDouble(scanner.nextLine());


       // ягоди, портокали, бананаи, малини  -- обща сума принтф
        // • цената на малините е на половина по-ниска от тази на ягодите;
        // • цената на портокалите е с 40% по-ниска от цената на малините;
        // • цената на бананите е с 80% по-ниска от цената на малините.



        double berriesPrice = strawberriesPriceInKg * 0.5;
        double orangePrice = berriesPrice - berriesPrice * 0.4;
        double bananaPrice = berriesPrice - berriesPrice * 0.8;


        double totalSum = (strawberriesPriceInKg * strawberriesVolumeInKg) +
                (orangeVolumeInKg * orangePrice) +
                (bananaVolumeInKg * bananaPrice) +
                (berriesPrice * berriesVolumeInKg);

        System.out.printf("%.2f", totalSum);
    }
}
