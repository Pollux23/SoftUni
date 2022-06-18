package FUND.P12Ex;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

//        for (int i = 0; i < secondArr.length; i++) {
//            for (int j = 0; j < firstArr.length; j++) {
//                if (secondArr[i].equals(firstArr[j])){
//                    System.out.print(secondArr[i] + " ");
//                }
//
//            }
//
//        }


        for (String s : secondArr) {
            for (String s1 : firstArr) {
                if (s.equals(s1)){
                    System.out.print(s + " ");
                }
            }
        }



    }

}
