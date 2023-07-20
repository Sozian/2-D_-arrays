// program to calculate sum of the middle row
public class sum_of_middle_row {
    public static int sum(int matrix[][]){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[1][j];
        }
        return sum;
    }
    public static void main(String [] args){
       int matrix[][]={{1,2,3,5},{3,4,5,6},{6,7,9,9}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum(matrix));
    }
}
