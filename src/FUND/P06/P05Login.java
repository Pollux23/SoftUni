package FUND.P06;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {

        //You will be given a string representing a username. The password will be that username reversed.
        // Until you receive the correct password print on the console "Incorrect password. Try again.".
        // When you receive the correct password print "User {username} logged in."
        // However on the fourth try if the password is still not correct print "User {username} blocked!" and end the program.
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;


        }
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);

    }
}
