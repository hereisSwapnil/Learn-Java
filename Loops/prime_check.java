import java.util.*;

public class prime_check{
    public static void main(String args[]){
        int n = 97;
        boolean isPrime = true;
        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if (n%i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println( (isPrime) ? "It is a Prime Number" : "It is not a Prime Number" );
    }
}