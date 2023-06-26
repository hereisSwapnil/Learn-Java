public class Update_ith_bit {
    public static int Set_ith__bit(int num, int i){
        int bitMask = 1<<i;
        return (num | bitMask);
    }
    public static int Clear_ith__bit(int num, int i){
        int bitMask = 1<<i;
        return (num & (~bitMask));
    }
    public static int Update_ith__bit(int num, int i, int newBit){
        if(newBit == 0){
            return Clear_ith__bit(num, i);
        }else{
            return Set_ith__bit(num, i);
        }
    }
    public static void main(String args[]){
        int a = 10;
        // 1010
        System.out.println(Update_ith__bit(a, 1, 0));
    } 
}
