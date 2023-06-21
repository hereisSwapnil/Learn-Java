public class zero_one_triangle{
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print((i+j)%2 == 0?1:0);
            }
            System.out.println();
        }
    }
}