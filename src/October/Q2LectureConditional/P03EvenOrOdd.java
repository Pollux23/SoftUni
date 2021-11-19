package October.Q2LectureConditional;

import java.util.Scanner;

public class P03EvenOrOdd {
    public static void main(String[] args) {

        //Да се напише програма, която чете цяло число, въведено от потребителя и печата дали е четно или нечетно.
        //Ако е четно отпечатайте "even", ако е нечетно "odd".

        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        if (inputNum % 2 == 0){  // even number
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
