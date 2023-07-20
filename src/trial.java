import javax.xml.transform.sax.SAXSource;
import java.util.*;
public class trial {
    public static void main(String []args){
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int k=rowWithMax1s(matrix,n,n);
        System.out.println(k);
    }
   public static int rowWithMax1s(int arr[][], int n, int m) {
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;

                }
            }
            if(count>max){
                max=count;
            }
            count=0;
        }
        return max;
    }
}
