public class method_overloading {

  public static void main(String args[]) {
    Calculator calc = new Calculator();
    System.out.println(calc.sum(2, 3, 4));
    System.out.println(calc.sum(2, 4));
  }
}

class Calculator {

  int sum(int a, int b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}
