package FUND.P19MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class q3AnotherOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> chatString = new ArrayList<>();
        String consoleInput = input.nextLine();

        while (!consoleInput.equals("end")) {
            List <String> commandList = Arrays.stream(consoleInput.split(" ")).collect(Collectors.toList());
            String command = commandList.get(0);
            String setString = "";
            int index = 0;
            String element = "";

            switch (command) {

                case "Chat" :
                    element = commandList.get(1);
                    chatString.add(element);
                    break;

                case "Delete" :
                    element = commandList.get(1);
                    chatString.remove(element);
                    break;

                case "Edit" :
                    element = commandList.get(1);
                    setString = commandList.get(2);
                    index = chatString.indexOf(element);
                    chatString.set(index, setString);
                    break;

                case "Pin" :
                    element = commandList.get(1);
                    index = chatString.indexOf(element);
                    chatString.remove(index);
                    chatString.add(element);
                    break;

                case "Spam" :
                    List <String> spamList = Arrays.stream(consoleInput.split(" ")).collect(Collectors.toList());
                    spamList.remove(0);
                    chatString.addAll(spamList);
                    break;

            }
            consoleInput = input.nextLine();
        }
        for (String chatElem : chatString) {
            System.out.println(chatElem);
        }
    }
}
