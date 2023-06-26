public class Set_ith_bit {
    public static int Set_ith__bit(int num, int i){
        int bitMask = 1<<i;
        return (num | bitMask);
    }
    public static void main(String args[]){
        int a = 10;
        // 1010
        // 0100
        // |
        // 1110
        System.out.println(Set_ith__bit(a, 2));
    } 
}
