import java.util.*;

public class keep_entering_till_multiple_of_10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("Enter any number: ");
            n = sc.nextInt();
        }while((n%10) != 0);
        System.out.println("Hehe! You entered a number which is a multiple of 10.");
        sc.close();
    }
}