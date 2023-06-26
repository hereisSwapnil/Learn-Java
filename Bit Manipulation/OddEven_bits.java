public class OddEven_bits {
    public static void main(String args[]){
        int OddEven;
        int n;
        n = 4;
        OddEven = n & 1;
        System.out.println(OddEven == 0?"Even":"Odd");
        n = 3;
        OddEven = n & 1;
        System.out.println(OddEven == 0?"Even":"Odd");
        n = 5;
        OddEven = n & 1;
        System.out.println(OddEven == 0?"Even":"Odd");
        n = 9;
        OddEven = n & 1;
        System.out.println(OddEven == 0?"Even":"Odd");
    }    
}
