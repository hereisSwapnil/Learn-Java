public class kadanes_algorithm_for_all_negative_values{
    public static int kadanes_max_sum_subarray(int numbers[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if( numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int numbers[] = {-1,-2,-6,-1,-3};
        System.out.println("Max Subarray Sum = "+kadanes_max_sum_subarray(numbers));
    }
}