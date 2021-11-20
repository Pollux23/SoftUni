package december.P01FirstStepsLecture;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectNum = Integer.parseInt(scanner.nextLine());

        int allProjectsTime = projectNum * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,allProjectsTime,projectNum);




    }
}
