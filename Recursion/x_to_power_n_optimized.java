public class x_to_power_n_optimized {

  public static int OpXpowerN(int x, int n) {
    if (n == 0) {
      return 1;
    }
    if (n % 2 == 0) {
      return OpXpowerN(x, n / 2) * OpXpowerN(x, n / 2);
    } else {
      return x * OpXpowerN(x, n / 2) * OpXpowerN(x, n / 2);
    }
  }

  public static void main(String[] args) {
    System.out.println(OpXpowerN(2, 4));
  }
}
