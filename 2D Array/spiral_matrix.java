public class spiral_matrix{
    public static void main(String args[]){
        int matrix[][] = {{1 , 2 , 3 , 13 , 17},
                          {4 , 5 , 6 , 14 , 18},
                          {7 , 8 , 9 , 15 , 19},
                          {10, 11, 12, 16 , 20},
                          {4 , 5 , 6 , 14 , 18}};
    int start_column = 0;
    int end_column = matrix[0].length - 1;
    int start_row = 0;
    int end_row = matrix.length - 1;
    while(start_row<=end_row && start_column<=end_column){
        for(int i = start_column; i<=end_column; i++){
            System.out.print(matrix[start_row][i]+ " ");
        }
        for(int i = start_row+1; i<=end_row; i++){
            System.out.print(matrix[i][end_column]+ " ");
        }
        for(int i = end_column-1; i>=start_column; i--){
            System.out.print(matrix[end_row][i]+ " ");
        }
        for(int i = end_row-1; i>=start_row+1; i--){
            System.out.print(matrix[i][start_column]+ " ");
        }
        start_column++;
        end_column--;
        start_row++;
        end_row--;
    }
    }
}