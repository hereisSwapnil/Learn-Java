import java.util.ArrayList;

public class activity_selection {
    public static void main(String[] args) {
        int start[] = new int[] { 1, 3, 0, 5, 8, 5 };
        int end[] = new int[] { 2, 4, 6, 7, 9, 9 };
        ArrayList<Integer> activity = new ArrayList<>();
        int selectCount = 1;
        int endTime = end[0];
        activity.add(0);
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= endTime) {
                selectCount++;
                endTime = end[i];
                activity.add(i);
            }
        }
        System.out.println("Max number of activities selected are: " + selectCount);
        System.out.print("Activities selected are: ");
        for (int i = 0; i < activity.size(); i++) {
            System.out.print(" A" + activity.get(i));
        }
        System.out.println("");
    }
}
