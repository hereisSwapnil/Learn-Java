public class prime_in_range{
    public static boolean prime_check(int a){
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void print_prime_in_range(int n){
        for(int i = 2; i<=n; i++){
            if(prime_check(i) == true){
                System.out.println(i);
            }
    }
    }
    public static void main(String args[]){
        int n = 10;
        print_prime_in_range(n);
    }
}
    