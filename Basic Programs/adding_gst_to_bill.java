import java.util.*;
public class adding_gst_to_bill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser: ");
        float eraser = sc.nextFloat();
        // Adding 18% gst
        double price_with_gst = (pencil+pen+eraser)*1.18;
        System.out.println("The total price of the bill with gst is: "+price_with_gst);
    }
}