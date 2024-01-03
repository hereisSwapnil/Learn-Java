public class factorial {
    public static int factorial_(int a) {
        int fac = 1;
        for (int i = a; i >= 1; i--) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String args[]) {
        int a = 5;
        System.out.print("Factorial of a is ");
        System.out.println(factorial_(a));
    }
}