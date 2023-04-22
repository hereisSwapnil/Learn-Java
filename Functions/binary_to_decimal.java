import java.util.*;
public class binary_to_decimal{
    public static int bin_dec(int a){
        int c = 0;
        int dec = 0;
        int temp;
        while(a>0){
            temp = (int) ((a%10)*(Math.pow(2,c)));
            dec += temp ;
            a = a/10;
            c+=1;
        }
        return dec;
    }
    public static void main(String args[]){
        int a = 1010010100;
        System.out.println(bin_dec(a));
    }
}