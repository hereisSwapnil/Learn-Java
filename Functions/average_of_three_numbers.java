public class average_of_three_numbers {
    public static int avg_of_three_num(int a, int b, int c) {
        return ((a + b + c) / 3);
    }

    public static void main(String args[]) {
        int a = 5;
        int b = 4;
        int c = 3;
        System.out.println((avg_of_three_num(a, b, c)));
    }
}