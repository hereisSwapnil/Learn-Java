public class pair_in_array{
    public static void two_pair(int numbers[]){
        for(int i = 0; i<=numbers.length-1; i++){
            int curr = numbers[i];
            for(int j = i+1; j<=numbers.length-1; j++){
                System.out.print("("+curr+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4};
        two_pair(numbers);
    }
}