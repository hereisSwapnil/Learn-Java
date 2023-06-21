import java.util.*;
public class area_of_square{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side of square: ");
        float side = sc.nextFloat();
        System.out.println("The Area of square of side "+side+" is "+side*side);
        sc.close();
    }
}