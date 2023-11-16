import java.util.ArrayList;

public class basicArrayList{
    public static void main(String args[]){
        // Initializing ArrayList
        // Can be of different class types
        // Integer, Float, Boolean etc
        ArrayList<Integer> list = new ArrayList<>();

        // Add element O(1)
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(9);
        System.out.println(list);

        // Get element O(1)
        System.out.println("Element at index 2: " + list.get(2));

        // Remove Element O(n)
        list.remove(2);
        System.out.println(list);

        // Set element at index O(n)
        list.set(2, 5);
        System.out.println(list);

        // Contains element O(n)
        System.out.println(list.contains(6));

        // Get size of ArrayList
        System.out.println("Size of ArrayList (list): " + list.size());
    }
}