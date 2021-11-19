package October.Q3Lecture;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {

        //Дадено число е валидно, ако е в диапазона [100…200] или е 0.
        // Да се напише програма, която чете цяло число, въведено от потребителя, и печата "invalid" ако въведеното число не е валидно.
        // http://i.imgur.com/BiHnzXk.png

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 100 && number >= 200 || number == 0){

        }else{
            System.out.println("invalid");
        }

        //or
        //boolean isValid = (number >= 100 && number >= 200 || number == 0);
        //if (!isValid){
         //   System.out.println("invalid");
        //  }
    }
}



