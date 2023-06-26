public class Clear_ith_bit {
    public static int Clear_ith__bit(int num, int i){
        int bitMask = 1<<i;
        return (num & (~bitMask));
    }
    public static void main(String args[]){
        int a = 10;
        // 1010
        // 1101
        // &
        // 1000
        System.out.println(Clear_ith__bit(a, 1));
    } 
}
