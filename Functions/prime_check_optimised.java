import java.util.*;

public class prime_check_optimised{
    public static boolean prime_check(int a){
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int a = 39;
        System.out.println(prime_check(a));
    }
}