import java.util.*;

public class isPalindrome_func{
    public static boolean isPalindrome(int a){
        int reverse = 0;
        int ori_num = a;
        while(a>0){
            reverse = (reverse * 10) + (a%10);
            a = a/10;
        }
        return true?(reverse == ori_num):false;
    }
    public static void main(String args[]){
        System.out.println(isPalindrome(1221291));
    }
}