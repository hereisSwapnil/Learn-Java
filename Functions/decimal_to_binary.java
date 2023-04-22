import java.util.*;
public class decimal_to_binary{
    public static int dec_bin(int a){
        int rem, temp;
        int BinNum = 0, power = 0;
        while(a>0){
            rem = a%2;
            a /= 2;
            BinNum += (rem*(Math.pow(10,power)));
            power += 1;
        }
        return BinNum;
    }
    public static void main(String args[]){
        int a = 660;
        System.out.println(dec_bin(a));
    }
}