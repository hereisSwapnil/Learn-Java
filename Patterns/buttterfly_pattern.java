public class buttterfly_pattern{
    public static void main(String args[]){
        int n = 4;
        for(int i = 1; i<=n; i++){  
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<=(2*n - 2*i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // for line break
            System.out.println();
        }
        for(int i = n; i>=0; i--){  
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<=(2*n - 2*i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // for line break
            System.out.println();
        }
    }
}