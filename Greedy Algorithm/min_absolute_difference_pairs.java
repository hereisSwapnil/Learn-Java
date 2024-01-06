import java.util.Arrays;

public class min_absolute_difference_pairs {
    public static void main(String[] args) {
        int A[] = new int[] { 4, 1, 8, 7 };
        int B[] = new int[] { 2, 3, 6, 5 };
        int minSum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            minSum += (Math.abs(A[i] - B[i]));
        }
        System.out.println("The minimun absolute difference is: " + minSum);
    }
}
