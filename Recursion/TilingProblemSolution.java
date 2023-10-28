public class TilingProblemSolution {

  public static int tilingProblem(int n) {
    // Base Case
    if (n == 0 || n == 1) {
      return 1;
    }
    // After putting one tile vertical then spaces left is n-1
    int ver = tilingProblem(n - 1);
    // After putting one tile horizontal then other one is also places horizontal and left spaces is n-2
    int hor = tilingProblem(n - 2);

    return ver + hor;
  }

  public static void main(String[] args) {
    System.out.println(tilingProblem(4));
  }
}
