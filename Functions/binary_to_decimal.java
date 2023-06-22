public class binary_to_decimal{
    public static int bin_dec(int a){
        int pow = 0;
        int temp;
        int DecNum = 0;
        while(a>0){
            temp = (int) ((a%10)*(Math.pow(2,pow)));
            DecNum += temp ;
            a = a/10;
            pow+=1;
        }
        return DecNum;
    }
    public static void main(String args[]){
        int a = 1010010100;
        System.out.println(bin_dec(a));
    }
}