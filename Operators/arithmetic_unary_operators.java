public class arithmetic_unary_operators{
    public static void main(String args[]){
        int a = 10;
        int b = ++a;
        // this will first increment the value of a by 1 and then store it in the variable b
        // a = 11
        // b = 11
        System.out.println(a + " "+ b);

        int c = 10;
        int d = c++;
        // this will first assign the value of c to d and then it will increment it by 1
        System.out.println(c + " " + d);
    }
}