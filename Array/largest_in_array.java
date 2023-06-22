public class largest_in_array{
    public static int LargestInArray(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {2,5,7,4,9,75,53,241,45};
        System.out.println(LargestInArray(numbers));
    }
}