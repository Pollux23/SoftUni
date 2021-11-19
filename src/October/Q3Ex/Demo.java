package October.Q3Ex;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

/*        if (day.equals("monday")) {
            System.out.printf("Today is %s", day);
        }else if (day.equals("Tuesday")){
            System.out.printf("Today is %s", day);
        }*/
        switch (day){
            case"monday":
                System.out.printf("Today is %s",day);
                break;
        }
    }
}
