import java.util.Arrays;
import java.util.Comparator;

public class indian_coins {
    public static void main(String[] args) {
        Integer coins[] = new Integer[] { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int targetSum = 590;
        int count = 0;
        Arrays.sort(coins, Comparator.reverseOrder());
        System.out.print("Coins used: ");
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= targetSum) {
                while (coins[i] <= targetSum) {
                    count++;
                    targetSum -= coins[i];
                    System.out.print(" " + coins[i] + " ");
                }
            }
        }
        System.out.println("");
        System.out.println("The minimum number of coins used: " + count);
    }
}
