public class sumOfDigits{
    public static int SumDigits(int a){
        int sum = 0;
        int last_digit = 0;
        while(a>0){
            last_digit = a%10;
            a /= 10;
            sum += last_digit;
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(SumDigits(123));
    }
}