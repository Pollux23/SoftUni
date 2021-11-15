package Q2LectureConditional;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {


        //а се напише програма, която чете парола (текст), въведена от потребителя и проверява дали въведената парола съвпада с фразата "s3cr3t!P@ssw0rd".
        // При съвпадение да се изведе "Welcome". При несъвпадение да се изведе "Wrong password!"

        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        if(pass.equals("s3cr3t!P@ssw0rd")){
            System.out.println("welcome");
        }else {
            System.out.println("Wrong Password");
        }
    }
}
