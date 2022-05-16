package december.P07Exam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double priceCpuInUsd = Double.parseDouble(scanner.nextLine());
         double priceGpuInUsd = Double.parseDouble(scanner.nextLine());
         double priceRamInUsd = Double.parseDouble(scanner.nextLine());
         int ramCount = Integer.parseInt(scanner.nextLine());
         double discount = Double.parseDouble(scanner.nextLine());


         double totalSumCpuGpu = priceCpuInUsd + priceGpuInUsd ;
         double discountCpuGpu = totalSumCpuGpu - totalSumCpuGpu * discount;

         double altogetherUSD = discountCpuGpu + ( priceRamInUsd * ramCount);
         double altogetherBGN = altogetherUSD * 1.57;

        System.out.printf("Money needed - %.2f leva.",altogetherBGN);





    }
}
