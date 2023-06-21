import java.util.*;

public class positive_or_negative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println( (n>=0)?"Positive":"Negative" );
    }
}