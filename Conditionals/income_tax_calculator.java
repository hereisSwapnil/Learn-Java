import java.util.*;

public class income_tax_calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter our income : ");
        int income = sc.nextInt();
        if(income<500000){
            System.out.println("Your Tax is "+ 0);
        }else if(income>=500000 && income<1000000){
            System.out.println("Your Tax is "+income*0.20);
        }else{
            System.out.println("Your Tax is "+income*0.30);
        }
    }
}