package FUND.P12Ex;

public class demo {
    public static void main(String[] args) {

        int[] num ={1,2,3,4,5};
        String[] str ={"a","b","c","d","e"};

        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);
        System.out.println(str[4]);

        System.out.println();

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }


        System.out.println();


        for (int number : num) {
            System.out.println(number);
        }


        System.out.println();


        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] *2);
        }
        System.out.println();


        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
