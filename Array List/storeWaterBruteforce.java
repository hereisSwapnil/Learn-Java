import java.util.ArrayList;

public class storeWaterBruteforce {
    public static int storeWater(ArrayList<Integer> height) {
        // Bruteforce - O(n^2)
        int maxWaterStored = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wd = j - i;
                int waterStored = ht * wd;
                if (waterStored > maxWaterStored) {
                    maxWaterStored = waterStored;
                }
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
