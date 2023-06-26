public class Get_ith_bit {
    public static int Get_ith__bit(int num, int i){
        int bitMask = 1<<i;
        if((num & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        int a = 10;
        // 1010
        // 0010
        // &
        // 0010
        System.out.println(Get_ith__bit(a, 1));
    }    
}
