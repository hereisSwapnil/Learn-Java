import java.util.ArrayList;
import java.util.Collections;

public class pairSum {
    public static void pairSumOptimised(ArrayList<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;
        Collections.sort(list);
        boolean existSum = false;
        System.err.println("SORTED : " + list);
        while (start < end) {
            int sum = list.get(start) + list.get(end);
            System.out.println(list);
            System.out.println("SUM: " + sum);
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                existSum = true;
                break;
            }
        }
        if (existSum) {
            System.out.println(
                    "The sum pair for target " + target + " is (" + list.get(start) + ", " + list.get(end) + ")");
        } else {
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int target = 4;
        pairSumOptimised(list, target);
    }
}
