import java.util.*;
public class area_of_circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float r = sc.nextFloat();
        System.out.print("The area of the circle is : ");
        // 3.14f - means convert 3.14 into a floating type number
        // As java takes any decimal type number default as double
        System.out.print(3.14f*r*r);
        sc.close();
    }
}