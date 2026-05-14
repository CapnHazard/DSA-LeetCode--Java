import java.util.Scanner;

public class StockBuySell {
    public int maxProfit(int prices []) {
        int max = 0; int left = 0; int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[left] > prices[i]) {
                left = i;
            } else if(prices[left] < prices[i]) {
                profit = prices[i] - prices[left];
                max = Math.max(max, profit);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int prices[] = new int [size];
        System.out.println("Enter elements: ");
        for(int i = 0; i < prices.length; i++) {
            System.out.print("-> ");
            prices[i] = sc.nextInt();
        }
        StockBuySell obj = new StockBuySell();
        System.out.println(obj.maxProfit(prices));
        sc.close();
    }
}
