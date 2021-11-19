package zAugust.zAug;

import java.util.Scanner;

public class P05Birthday {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loanHall = Integer.parseInt(sc.nextLine());
        double cakePrice  = loanHall * 0.2;
        double beveragesPrice = cakePrice - cakePrice * 0.45;
        double animatorPrice = loanHall * 1/3;

        double totalSum = loanHall + cakePrice + beveragesPrice + animatorPrice;
        System.out.println(totalSum);

       //         double beveragesPrice = cakePrice - cakePrice * 0.45; or
       //         double beveragesPrice =  cakePrice * 0.55;  0.45 + 0.55 = 100 %


      //Zа рожденият ден на дъщеря си, Людмила е решила да организира парти, на което да покани всичките ѝ съученици. За целта е решила да наеме развлекателна зала за деца, чийто наем ще получите като вход от конзолата.
        //Напишете програма, с която да помогнете на Людмила да изчисли какъв бюджет ще ѝ бъде необходим, като имате следната информация за допълнителните неща, необходими за тържеството:
        //    • Торта  – цената ѝ е 20% от наема на залата
        //    • Напитки – цената им е 45% по-малко от тази на тортата
        //    • Аниматор – цената му е 1/3 от цената за наема на залата


    }
}
