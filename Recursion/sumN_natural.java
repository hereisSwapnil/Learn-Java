public class sumN_natural {

  public static int sumN(int n) {
    if(n == 1){
        return 1;
    }
    return n + sumN(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(sumN(5));
  }
}
