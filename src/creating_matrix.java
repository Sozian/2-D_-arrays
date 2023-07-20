//
import java.util.*;
public class creating_matrix {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int n=sc.nextInt();
        int i=0;
        int matrix[][]=new int[10][10];
        for(int k=0;k<n;k++){
            if (k*i != n ) {
                matrix[k-i][i]=sc.nextInt();
                matrix[k-i+1][i]=sc.nextInt();
                matrix[k-i+2][i]=sc.nextInt();
                i++;
            }
        }
        for(int m=0;m<n;m++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[m][j]+" ");
            }
            System.out.println();
        }
    }
}
