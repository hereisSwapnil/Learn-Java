import java.util.ArrayList;

public class swapElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        // list.add(54);
        list.add(23);
        list.add(12);
        // list.add(76);
        list.add(8);
        list.add(65);
        int idx1 = 2;
        int idx2 = 5;
        System.out.println("Before: " + list);
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println("After: " + list);
    }
}
