import java.util.Arrays;
import java.util.Comparator;

public class sorting_activities_using_comparator {
    public static void main(String[] args) {
        int start[] = new int[] { 0, 1, 8, 3, 5, 5 };
        int end[] = new int[] { 6, 2, 9, 4, 7, 9 };
        int activity[][] = new int[end.length][3];
        for (int i = 0; i < end.length; i++) {
            for (int j = 0; j < 3; j++) {
                activity[i][0] = i;
                activity[i][1] = start[i];
                activity[i][2] = end[i];
            }
        }
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));
        for (int i = 0; i < end.length; i++) {
            System.out.println(activity[i][1] + " " + activity[i][2]);
        }
    }
}
