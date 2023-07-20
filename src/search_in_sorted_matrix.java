// Brute_force_approach
import java.util.*;
public class search_in_sorted_matrix {

    public static void search(int key,int matrix[][]){
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               if(key==matrix[i][j]){
                   System.out.println("key found sucessfully");
                   return;
               }
           }
       }
    }
    public static void main(String [] args){
        // first way of creation
       // int matrix[][]=new int[10][10];

        // second way of creation of matrix
        int matrix[][]={{1,2,3},
                {5,6,7},
                {9,10,11}};
        Scanner sc=new Scanner(System.in);

        //for(int i=0;i<4;i++){
        //    for(int j=0;j<5;j++){
        //        matrix[i][j]=sc.nextInt();
        //   }
        //}
        System.out.println("enter the key element");
        int key=sc.nextInt();
        search(key,matrix);
    }
}
