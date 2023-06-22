public class sub_array{
    // public static void sub_array(int numbers[]){
    //     for(int i = 0 ; i<=numbers.length-1; i++){
    //         int curr = numbers[i];
    //         System.out.print("["+curr+"]");
    //         for(int j = i+1; j<=numbers.length-1; j++){
    //             System.out.print("["+curr);
    //             for(int k = i+1; k<=j; k++){
    //                 System.out.print(","+numbers[k]);
    //             }
    //             System.out.print("]");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void sub_array(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++){
                System.out.print("[");
                for(int k = i; k<=j; k++){
                    System.out.print(numbers[k]);
                    if(k!=j){
                        System.out.print(",");
                    }
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        sub_array(numbers);
    }
}