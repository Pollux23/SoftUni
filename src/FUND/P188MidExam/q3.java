package FUND.P188MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        List<String> commands = new ArrayList<>(List.of(input.split(" ")));
        List<String> chatlog = new ArrayList<>();
        while (!commands.get(0).equals("end")) {
            switch (commands.get(0)) {
                case "Chat":
                    chatlog.add(commands.get(1));
                    break;

                case "Delete":
                    if (chatlog.contains(commands.get(1))){
                        chatlog.remove(commands.get(1));
                    }else {
                        break;
                    }
                    break;

                case "Edit":
                    String message = commands.get(1);
                    String update = commands.get(2);
                    if (chatlog.contains(message)){
                        chatlog.set(chatlog.indexOf(message),update);
                    }else {
                        break;
                    }
                    break;

                case "Pin":
                    String message1 = commands.get(1);
                    if (chatlog.contains(message1)){
                        chatlog.remove(message1);
                        chatlog.add(message1);
                    }else {
                        break;
                    }
                    break;

                case "Spam":
                    for (int i = 1; i <commands.size() ; i++) {
                        String spamMessage = commands.get(i);
                        chatlog.add(spamMessage);
                    }
                    break;

            }
            commands = List.of(scanner.nextLine().split(" "));
        }
        for (String s : chatlog) {
            System.out.println(s);
        }
    }
}
