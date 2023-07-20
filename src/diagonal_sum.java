public class diagonal_sum {
    public static  int diagonal_summ(int matrix[][]){
        int sum;
        int sum1=0;int sum2=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                if(i==j){
                   sum1=sum1+matrix[i][j] ;
                }
            }
        }
        System.out.println("sum1 "+sum1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i+j==(matrix.length)-1){
                    sum2=sum2+matrix[i][j] ;
                }
            }
        }
        System.out.println("sum2 "+sum2);
        sum=sum1+sum2;
        return sum;
    }
    public static void main(String [] args){
        int matrix[][]={{1,2,3},
                 {5,6,7},
                 {10,10,11}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        int a=diagonal_summ(matrix);
        System.out.println(a);
    }
}
