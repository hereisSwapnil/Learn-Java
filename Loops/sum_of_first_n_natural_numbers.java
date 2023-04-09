public class sum_of_first_n_natural_numbers{
    public static void main(String args[]){
        int n = 5;
        int sum = 0;
        int i  = 1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.print(sum);
    }
}