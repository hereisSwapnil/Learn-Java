public class factorial{
    public static void main(String args[]){
        int n = 4;
        int fac = 1;
        for(int i = n ; i>1 ; i--){
            fac *= i;
        }
        System.out.println(n+"! = "+fac);
    }
}