package FUND.P12Ex;

public class demo1 {
    public static void main(String[] args) {
        String[] imena = new String[5];

        imena[0] = "spas";
        imena[1] = "mitko";
        imena[2] = "niki";
        imena[3] = "ivan";
        imena[4] = "stavri";

        for (int i = imena.length - 1; i >= 0; i--) {
            System.out.println(imena[i]);
        }
    }
}
