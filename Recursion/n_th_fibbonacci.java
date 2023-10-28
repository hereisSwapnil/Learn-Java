public class n_th_fibbonacci {

  public static int nThFibbonacci(int n) {
    if (n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    }
    return nThFibbonacci(n - 2) + nThFibbonacci(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(nThFibbonacci(4));
  }
}
