public class bino_coff {
    public static int factorial (int a){
        int fac = 1;
        for (int i = a; i>=1; i--){
            fac*=i;
        }
        return fac;
    }
    public static int bino__coff (int n, int r){
        int n_ = factorial(n);
        int r_ = factorial(r);
        int n_r = factorial(n-r);
        int bino = (n_)/((r_)*(n_r));
        return bino;
    }
    public static void main(String args[]){
        int n = 5;
        int r = 2;
        System.out.print("The value of nCr is ");
        System.out.println(bino__coff(n,r));
    }
}