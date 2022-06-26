package decemberFirstSteps.P10;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        double souvenirBoughtCount = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (team.equals("Argentina") && souvenir.equals("flags")) {
            price = souvenirBoughtCount * 3.25;
        } else if ((team.equals("Argentina") && souvenir.equals("caps"))) {
            price = souvenirBoughtCount * 7.20;
        } else if (team.equals("Argentina") && souvenir.equals("posters")) {
            price = souvenirBoughtCount * 5.10;
        } else if ((team.equals("Argentina") && souvenir.equals("stickers"))) {
            price = souvenirBoughtCount * 1.25;

        } else if ((team.equals("Brazil") && souvenir.equals("flags"))) {
            price = souvenirBoughtCount * 4.2;
        } else if ((team.equals("Brazil") && souvenir.equals("caps"))) {
            price = souvenirBoughtCount * 8.5;
        } else if ((team.equals("Brazil") && souvenir.equals("posters"))) {
            price = souvenirBoughtCount * 5.35;
        } else if ((team.equals("Brazil") && souvenir.equals("stickers"))) {
            price = souvenirBoughtCount * 1.2;

        } else if ((team.equals("Croatia") && souvenir.equals("flags"))) {
            price = souvenirBoughtCount * 2.75;
        } else if ((team.equals("Croatia") && souvenir.equals("caps"))) {
            price = souvenirBoughtCount * 6.90;
        } else if (team.equals("Croatia") && souvenir.equals("posters")) {
            price = souvenirBoughtCount * 4.95;
        } else if (team.equals("Croatia") && souvenir.equals("stickers")) {
            price = souvenirBoughtCount * 1.1;


        } else if (team.equals("Denmark") && souvenir.equals("flags")) {
            price = souvenirBoughtCount * 3.10;
        } else if (team.equals("Denmark") && souvenir.equals("caps")) {
            price = souvenirBoughtCount * 6.5;
        } else if (team.equals("Denmark") && souvenir.equals("posters")) {
            price = souvenirBoughtCount * 4.8;
        } else if (team.equals("Denmark") && souvenir.equals("stickers")) {
            price = souvenirBoughtCount * 0.9;

        }
        if (team.equals("Argentina") || team.equals("Brazil") || team.equals("Croatia") ||
                team.equals("Denmark")) {
            if (souvenir.equals("flags") || souvenir.equals("caps") || souvenir.equals("posters")
            || souvenir.equals("stickers")){
                System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", souvenirBoughtCount, souvenir,team, price);
            }
            if (!team.equals("Argentina") || !team.equals("Brazil") || !team.equals("Croatia") ||
                    !team.equals("Denmark")){
                System.out.println("Invalid country!");
            }
        }
    }
}