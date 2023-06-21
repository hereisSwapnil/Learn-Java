public class hollow_rhombus{
    public static void main(String args[]){
        int n = 5;
        for(int i = n; i>0; i--){
            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++){
                if(i==n || i==1){
                    System.out.print("*");
                }
                else if(j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}