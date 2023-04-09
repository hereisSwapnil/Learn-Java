public class leap_year{
    public static void main(String args[]){
        int year = 2020;
        // if (year%4==0){
        //     if (year%100==0){
        //         if (year%400==0){
        //             System.out.println("It is a Leap Year.");
        //         }
        //     }
        // }else{
        //     System.out.println("It is not a Leap Year.");
        // }
        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = ((year%400)==0) && ((year%100)==0);
        System.out.println( (x && (y || z))?"It is a Leap Year":"It is not a Leap Year" );
    }
}