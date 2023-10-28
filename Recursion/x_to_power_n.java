public class x_to_power_n {

  public static int xPowern(int x, int n) {
    if (n == 1) {
      return x;
    }
    return (x * xPowern(x, n - 1));
  }

  public static void main(String[] args) {
    System.out.println(xPowern(2, 3));
  }
}
