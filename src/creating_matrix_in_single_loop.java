import java.util.*;
public class creating_matrix_in_single_loop {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int n=sc.nextInt();
        int matrix[][]=new int[10][10];
        for(int i=n;i>0;i--){
            /*if(i==0  || i==1 || i==2){
                matrix[i][0]=sc.nextInt();
                if(i==2){
                    matrix[i][1]=sc.nextInt();
                }
            }*/
            int j=0;
            if(i==n){
                matrix[i][j]=sc.nextInt();
                j++;
                i--;
                matrix[i][j]=sc.nextInt();

            }
            if(j==1){

            }
           matrix[i][0]=sc.nextInt();
           matrix[i][1]=sc.nextInt();
           matrix[i][2]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
