public class print_n_to_1 {

  public static void printDec(int n) {
    if (n == 1) {
      System.out.println(n);
      return;
    }
    System.out.println(n);
    printDec(n - 1);
  }

  public static void main(String args[]) {
    printDec(3);
  }
}
