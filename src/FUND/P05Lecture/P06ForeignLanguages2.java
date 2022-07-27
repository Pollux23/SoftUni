package FUND.P05Lecture;

import java.util.Scanner;

public class P06ForeignLanguages2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
//        if (country.equals("USA")||country.equals("England")){
//            System.out.println("English");
//        } else if (country.equals("Spain")||country.equals("Argentina")||country.equals("Mexico")) {
//            System.out.println("Spanish");
//        }else {
//            System.out.println("Unknown");
//        }


        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }

    }
}
