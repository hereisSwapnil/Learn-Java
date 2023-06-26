public class Clear_i_bit {
    public static int Clear_i__bit(int num, int i){
        int BitMask = (~0)<<i;
        return (num & BitMask);
    }
    public static void main(String args[]){
        int num = 10;
        // 1010
        // 1100
        // &
        // 1000
        System.out.println(Clear_i__bit(num, 2));
    }
}
