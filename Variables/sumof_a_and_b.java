import java.util.*;
public class sumof_a_and_b{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("\n");
        System.out.print("The sum of numbers is : ");
        System.out.print(a+b);
        sc.close();
    }
}