package december.P04ForLoopLab;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "nick";

        //  ПЕЧАТАНЕ НА ДИЛЖИНАТА НА ТЕКСТА -- БРОЯ НА СИМВОЛИТЕ
        System.out.println(text.length());    // - prints the length of the text - how many symbols - chars

        //пЕЧАТАНЕ НА ПЪРВИЯ СИМВОЛ ! - ПЪРВИЯ СИМВОЛ ВИНАГИ СЕДИ НА НУЛЕВА ПОЗИЦИЯ
        System.out.println(text.charAt(0));  // - prints the "char" at position number !

        //ПЕЧАТАНЕ НА ПОСЛЕДНИЯ СИМВОЛ ! - ПОСЛЕДНИЯ Е " length - 1 "
        System.out.println(text.charAt(text.length()-1));


    }
}
