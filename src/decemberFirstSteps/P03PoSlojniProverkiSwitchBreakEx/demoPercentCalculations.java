package decemberFirstSteps.P03PoSlojniProverkiSwitchBreakEx;

public class demoPercentCalculations {
    public static void main(String[] args) {

// percent of something is calculated as follows:

        double price = 100.0;

        // 5 % discount example
        price = price - price * 0.05;
        //or
        price = price * 0.95;

        System.out.println(price);
    }
}
