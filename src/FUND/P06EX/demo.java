package FUND.P06EX;

public class demo {
    public static void main(String[] args) {
        String cici = "boski";
        String text = "Acer";
        System.out.println(text.charAt(0));  //първа буква   ( пъвата е нулева позиция )
        System.out.println(text.length());    // брой на буквите / символите
        System.out.println(text.charAt(text.length()-1));  // последната буква
        System.out.println();

        for (int position = 0; position <=text.length()-1; position++) {
            System.out.println(text.charAt(position));
        }

        
    }
}
