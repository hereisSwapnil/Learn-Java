public class max_subarray_sum {
    public static int max__subarray__sum(int numbers[]) {
        int Sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int temp_sum = 0;
                for (int k = i; k <= j; k++) {
                    temp_sum += numbers[k];
                }
                if (temp_sum > Sum) {
                    Sum = temp_sum;
                }
            }
            return Sum;
        }
        return 0;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        System.out.println("Max Subarray Sum = " + max__subarray__sum(numbers));
    }
}