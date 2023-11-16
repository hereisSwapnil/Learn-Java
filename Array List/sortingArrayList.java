import java.util.ArrayList;
import java.util.Collections;

public class sortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(54);
        list.add(23);
        list.add(12);
        list.add(76);
        list.add(8);
        list.add(65);
        System.out.println("List before sorting: " + list);
        Collections.sort(list);
        System.out.println("List after sorting: " + list);
    }
}
