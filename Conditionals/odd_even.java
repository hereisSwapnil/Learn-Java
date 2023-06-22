import java.util.*;

public class odd_even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}