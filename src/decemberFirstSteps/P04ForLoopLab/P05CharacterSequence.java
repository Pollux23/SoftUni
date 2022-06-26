package decemberFirstSteps.P04ForLoopLab;

import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        //"softuni"
        //всяка позиция от 0 до послендата (дължина - 1)
        //повтарям: взимам символа на позицията + отпечатвам
        //начало: 0
        //край: дължина - 1
        //промяна: ++

        for (int position = 0; position <= text.length() - 1; position++) {
            char currentSymbol = text.charAt(position);
            System.out.println(currentSymbol);
        }


    }
}

