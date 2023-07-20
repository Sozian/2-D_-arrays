// in this question we need to search the element in the sorted matrix
//The approach used in the code is as follows:
//
//Start at the top-right corner of the matrix.
//If the current element is equal to the key, return true.
//If the current element is greater than the key, move left in the same row.
//If the current element is less than the key, move down to the next row.
//Repeat steps 2-4 until the key is found or all elements are searched.
//The main function initializes the matrix and the key to be searched and calls the search_in_matrix function to perform the search. The function returns true if the key is found, false otherwise.
//
//The code has a bug in the second if condition of the while loop. Instead of comparing the key with the matrix element, it compares the key with the number of rows in the matrix. The correct condition should be if(key < matrix[row][col]).
//
//Here's the corrected code:
//
public class search_in_sorted_sorted_matrix {
    public static boolean search_in_matrix(int matrix[][],int n,int key){
        int row=0;
        int mid;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==key){
                return true;
            }
            if(key< matrix.length){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String [] args){
           int matrix[][]={{1,2,3,4},
                           {5,6,7,8},
                            {9,10,11,12},
                             {13,14,15,16}};
           int key=8;
           int n=matrix.length;
        System.out.println(  search_in_matrix(matrix,n,key));
    }
}
