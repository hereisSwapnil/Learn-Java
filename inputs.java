import java.util.*;

public class inputs{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /* 
        taking a string input till space
        ex: if "Tony Stark" is given as input it will take only "Tony"
        */ 
        String name1 = sc.next();
        System.out.println(name1);

        /* 
        taking a string sentence after space also
        ex: if "Tony Stark" is given as input it will take "Tony Stark" as inputted string
        */ 
        // String name2 = sc.nextLine();
        // System.out.println(name2); 
        
        // taking integer input
        int num = sc.nextInt();
        System.out.println(num);
        
        // taking float input
        float fl = sc.nextFloat();
        System.out.println(fl);  

        // Scanner class is closed
        sc.close();
        /*
        next - to input only words before a space
        nextLine - to input a sentences even with spaces
        nextInt - to input integer values
        nextByte - to input byte values
        nextFloat - to input float values
        nextDouble - to input double values
        nextBoolean - to input bool values
        nextShort - to input short type values
        nextLong - to input long type values
        */
    }
}