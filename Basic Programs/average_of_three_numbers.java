import java.util.*;
public class average_of_three_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter third number: ");
        float c = sc.nextFloat();
        float avg = (a+b+c)/3;
        System.out.println("The Average of three numbers is: "+ avg);
        sc.close();
    }
}