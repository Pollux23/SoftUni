package decemberFirstSteps.P03PoSlojniProverkiSwitchBreakLecture;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // https://prnt.sc/24i2c1n

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        /*
        if (town.equals("Sofia") && product.equals("coffee")) {
            System.out.println(quantity * 0.5);
        } else if (town.equals("Sofia") && product.equals("water")) {
            System.out.println(quantity * 0.8);
        }else if (town.equals("Sofia") && product.equals("beer")){
            System.out.println(quantity * 1.2);
        }else if (town.equals("Sofia") && product.equals("sweets")){
            System.out.println( quantity * 1.45);
        }else if (town.equals("Sofia") && product.equals("peanuts")){
            System.out.println(quantity * 1.6);
        }else if (town.equals("Plovdiv") && product.equals("coffee")){
            System.out.println(quantity * 0.4);
        }else if (town.equals("Plovdiv") && product.equals("water")){
            System.out.println(quantity * 0.7);
        }else if (town.equals("Plovdiv") && product.equals("beer")){
            System.out.println(quantity * 1.15);
        }else if (town.equals("Plovdiv") && product.equals("sweets")){
            System.out.println(quantity * 1.3);
        }else if (town.equals("Plovdiv") && product.equals("peanuts")){
            System.out.println(quantity * 1.5);
        }else if (town.equals("Varna") && product.equals("coffee")){
            System.out.println(quantity * 0.45);
        }else if (town.equals("Varna") && product.equals("water")){
            System.out.println(quantity * 0.7);
        }else if (town.equals("Varna") && product.equals("beer")){
            System.out.println(quantity * 1.1);
        }else if (town.equals("Varna") && product.equals("sweets")){
            System.out.println(quantity * 1.35);
        }else if (town.equals("Varna") && product.equals("peanuts")){
            System.out.println(quantity * 1.55);
        }
        */

        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        price = 0.5;
                        break;
                    case "water":
                        price = 0.8;
                        break;
                    case "beer":
                        price = 1.2;
                        break;
                    case "sweets":
                        price = 1.45;
                        break;
                    case "peanuts":
                        price = 1.6;
                        break;
                    default:
                        System.out.println("Invalid Product");

                }
                break;
            case "Plovdiv":
                switch (product){
                    case "coffee":
                        price = 0.4;
                        break;
                    case "water":
                        price = 0.7;
                        break;
                    case "beer":
                        price = 1.15;
                        break;
                    case "sweets":
                        price = 1.3;
                        break;
                    case"peanuts":
                        price = 1.5;
                        break;
                    default:
                        System.out.println("Invalid Product");

                }
                break;
            case "Varna":
                switch (product){
                    case "coffee":
                        price = 0.45;
                        break;
                    case "water":
                        price = 0.7;
                        break;
                    case "beer":
                        price = 1.1;
                        break;
                    case "sweets":
                        price = 1.35;
                        break;
                    case "peanuts":
                        price = 1.55;
                        break;
                    default:
                        System.out.println("Invalid Product");
                }
                break;
            default:
                System.out.println("Invalid Town");
        }

        System.out.println(quantity * price);

    }
}

