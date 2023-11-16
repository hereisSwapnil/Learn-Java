import java.util.ArrayList;

public class maxElement {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(54);
        list.add(23);
        list.add(12);
        list.add(76);
        list.add(8);
        list.add(65);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("The maximum element in " + list + " is: " + max);
    }
}
