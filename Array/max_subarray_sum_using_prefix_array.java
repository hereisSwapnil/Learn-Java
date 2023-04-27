public class max_subarray_sum_using_prefix_array{
    public static int max_subarray_sum(int numbers[]){
        int prefix_array[] = new int[numbers.length];
        int Max_Sum = 0;
        int Curr_Sum = 0;
        for(int i = 0; i<numbers.length; i++){
            int pre_sum = 0;
            for(int j = 0; j<=i; j++){
                pre_sum += numbers[j];
            }
            prefix_array[i] = pre_sum;
        }
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                Curr_Sum = start == 0 ? prefix_array[end] : prefix_array[end] - prefix_array[start-1];
                if(Max_Sum<Curr_Sum){
                    Max_Sum = Curr_Sum;
                }
            }
        }
        return Max_Sum;
    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        System.out.println("Max Subarray Sum = "+max_subarray_sum(numbers));
    }
}