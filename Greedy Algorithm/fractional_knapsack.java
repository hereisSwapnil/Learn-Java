import java.util.*;

public class fractional_knapsack {
    public static void main(String[] args) {
        int value[] = new int[] { 100, 120, 60 };
        int weight[] = new int[] { 20, 30, 10 };
        int W = 50;
        float price = 0;
        float arr[][] = new float[value.length][4];
        for (int i = 0; i < value.length; i++) {
            arr[i][0] = i;
            arr[i][1] = value[i] / weight[i];
            arr[i][2] = value[i];
            arr[i][3] = weight[i];
        }
        ArrayList<Integer> sack = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        for (int i = value.length - 1; i >= 0; i--) {
            if (arr[i][3] <= W) {
                sack.add(i);
                W -= arr[i][3];
                price = price + arr[i][2];
            } else {
                sack.add(i);
                price = price + (W * arr[i][1]);
                W -= W;
                break;
            }
        }

        System.out.println(price);
    }
}
