package October.Q3Lecture;

import java.util.Scanner;

public class P04PersonalTitles {
    /*
    Да се напише конзолна програма, която прочита възраст (десетично число) и пол ("m" или "f"),
     въведени от потребителя, и отпечатва обръщение измежду следните:
    • "Mr." - мъж (пол "m") на 16 или повече години
    • "Mister" - момче (пол "m") под 16 години
    • "Ms." - жена (пол "f") на 16 или повече години
    • "Miss" - момиче (пол "f") под 16 години

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if ("m".equals(gender)) {
            if (age >= 16) {
                System.out.println("Mr.");
            }else {
                System.out.println("Mister");
            }

        } else if("f".equals(gender)){
            if (age >= 16){
                System.out.println("Ms.");
            }else {
                System.out.println("Miss");
            }
        }



    }
}
