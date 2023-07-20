import java.util.*;
public class traspose_of_matrix {
    public static void transpose(int matrix[][]) {
        int temp;
        for (int k = 0; k <= matrix.length-1; k++) {
            for (int i = k; i <= matrix.length - 1; i++) {

                for (int j = 1; j <= matrix[0].length-1; j++) {
                    if(i==j){
                        break;
                    }
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }

            }
        }
    }

    public static void main(String [] args){
        int matrix[][]={{1,2,3},
                {5,6,7},
                {9,10,11},
                };
        transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

    }
}
