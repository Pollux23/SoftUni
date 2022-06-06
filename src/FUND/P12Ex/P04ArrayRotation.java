package FUND.P12Ex;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

   String[] firstName = new String[3];
   firstName[0] = "ivan";
   firstName[1] = "petko";
   firstName[2] = "mitko";

   String[] lastName = {"draganov", "kolev", "petrov"};

        for (int i = 0; i < firstName.length; i++) {
            System.out.println(firstName[i] + " " + lastName[i]);
        }

    }
}
