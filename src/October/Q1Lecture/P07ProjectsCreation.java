package October.Q1Lecture;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String architectName = scanner.nextLine();
        int projectNumber = Integer.parseInt(scanner.nextLine());
        int projectTimeNeeded = projectNumber * 3;



        System.out.println("The architect" + architectName + "will need" + "hours to complete" + projectNumber + "project/s");

    }
}
