package december.P08ExamOld;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String breed = scanner.nextLine();
        String gender = scanner.nextLine();

        int catAge = 0;


        switch (breed) {
            case "British Shorthair":
                if (gender.equals("m")) {
                    catAge = 13;
                } else {
                    catAge = 14;
                }
                break;


            case "Siamese":
                if (gender.equals("m")) {
                    catAge = 15;
                } else
                    catAge = 16;
                break;


            case "Persian":
                if (gender.equals("m")){
                    catAge = 14;
                }else {
                    catAge = 15;
                }
                break;




            case "Ragdoll":
                if (gender.equals("m")){
                    catAge = 16;
                }else {
                    catAge = 17;
                }
                break;



            case "American Shorthair":
                if (gender.equals("m")){
                    catAge = 12;
                }else{
                    catAge = 13;
                }
                break;



            case "Siberian":
                if (gender.equals("m")){
                    catAge = 11;
                }else {
                    catAge = 13;
                }
                break;

        }

        int inHumanMonths = catAge * 12;
        int realCatAge = inHumanMonths / 6;

        if (breed.equals("British Shorthair") || breed.equals("Siamese") || breed.equals("Persian") || breed.equals("Ragdoll")
                || breed.equals("American Shorthair") || breed.equals("Siberian")) {
            System.out.printf("%d cat months", realCatAge);
        } else {
            System.out.printf("%s is invalid cat!", breed);
        }
    }
}
