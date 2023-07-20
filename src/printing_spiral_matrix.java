import java.util.*;
public class printing_spiral_matrix {

    public static void print_spiral(int matrix[][],int n){
       int start_row=0;
       int start_col=0;
       int end_row= matrix.length-1;
       int end_col=matrix[0].length-1;
       while(start_row<end_row && start_col<end_row) {
           // printing the top boundaries
           for (int i = start_row; i <= end_row; i++) {
               System.out.println(matrix[start_row][i]);
           }
           //printing right most column
           for (int j = start_col + 1; j <= end_col; j++) {
               System.out.println(matrix[j][end_col]);
           }
           // printing bottom row
           for (int i = end_row-1; i >= 0; i--) {
               System.out.println(matrix[matrix.length-1-start_row][i]);
           }
           // printing left most boundary of column
           for (int j = end_col; j >= 0; j--) {
               System.out.println(matrix[j][start_row]);
           }
           start_row++;
           end_row--;
           start_col++;
           end_col--;
       }
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {6,7,8,9},
                        {10,11,12,13},
                        {14,15,16,17}};
        int n= matrix.length-1;
        print_spiral(matrix,n);
       /* for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}
