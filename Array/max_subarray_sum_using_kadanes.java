public class max_subarray_sum_using_kadanes{
    public static int kadanes_max_sum_subarray(int numbers[]){
        int max_sum = 0;
        int curr_sum = 0;
        for(int i = 0; i<numbers.length; i++){
            curr_sum += numbers[i];
            if(curr_sum < 0){
                curr_sum = 0;
            }
            max_sum = max_sum>curr_sum?max_sum:curr_sum;
        }
        return max_sum;
    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        System.out.println("Max Subarray Sum = "+kadanes_max_sum_subarray(numbers));
    }
}