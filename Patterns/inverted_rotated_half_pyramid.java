public class inverted_rotated_half_pyramid{
    public static void main(String args[]){
        int n = 4;
        for(int i = 1; i<=4; i++){
            // spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}