import java.util.ArrayList;

public class storeWaterOptimised {

    public static int storeWater(ArrayList<Integer> height) {
        // Optimised - O(n)
        // TWO POINTER APPROACH
        int maxWaterStored = 0;
        int start = 0;
        int end = height.size() - 1;
        while (start < end) {
            int ht = Math.min(height.get(start), height.get(end));
            int wd = end - start;
            int storedWater = ht * wd;
            if (storedWater > maxWaterStored) {
                maxWaterStored = storedWater;
            }
            if (height.get(start) < height.get(end)) {
                start++;
            } else {
                end--;
            }
        }
        return maxWaterStored;
    }

    public static void main(String[] args) {
        ArrayList<Integer> containers = new ArrayList<>();
        containers.add(1);
        containers.add(8);
        containers.add(6);
        containers.add(2);
        containers.add(5);
        containers.add(4);
        containers.add(8);
        containers.add(3);
        containers.add(7);
        System.out.println("The maximum water that can be stored is: " + storeWater(containers));
    }
}
