package FUND.P19MidExam;

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> coffeeType = new ArrayList<>(List.of(input.split(" ")));
        int numberCommands = scanner.nextInt();

        List<String> command;
        for (int i = 0; i <= numberCommands; i++) {
            command = List.of(scanner.nextLine().split(" "));
            switch (command.get(0)) {
                case "Include":
                    coffeeType.add(command.get(1));
                    break;

                case "Remove":
                    String firstOrLast = command.get(1);
                    int numberOfCoffees = Integer.parseInt(command.get(2));
                    if (firstOrLast.equals("last")){
                        for (int j = 0; j < numberOfCoffees ; j++) {
                            coffeeType.remove(coffeeType.size()-1);
                        }
                    }else {
                        for (int j = 0; j <numberOfCoffees ; j++) {
                            coffeeType.remove(coffeeType.get(0));
                        }
                    }
                    break;

                case "Prefer":
                    int indexA = Integer.parseInt(command.get(1));
                    int indexB = Integer.parseInt(command.get(2));
                    String temp = coffeeType.get(indexB);
                    coffeeType.set(indexB,coffeeType.get(indexA));
                    coffeeType.set(indexA, temp);
                    break;

                case "Reverse":
                    Collections.reverse(coffeeType);
                    break;


            }
        }

        System.out.println("Coffees:");

        for (String s : coffeeType) {
            System.out.print(s + " ");
        }

    }
}
