import java.util.*;

public class searching_in_2d_array{
    public static boolean search_array(int arr[][], int key){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(arr[i][j] == key){
                    System.out.println("Found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search_array(matrix,4);
    }
}