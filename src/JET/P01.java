package JET;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String name = scanner.nextLine();
         int yearsExperience = Integer.parseInt(scanner.nextLine());
         String cuisinePreference = scanner.nextLine();

        System.out.printf("The form for %s is completed. We will contact you if we need a chef who cooks %s dishes and has %d years of experience.",
                name,cuisinePreference,yearsExperience);


    }
}
