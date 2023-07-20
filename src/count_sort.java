import java.util.*;
public class count_sort {
    public static void count(int a[],int n){
        int freq=0;
        int largest=Integer.MIN_VALUE;
        // we need to calculate the range of the element

        int b[];
        for(int i=0;i<n;i++){
            largest=Math.max(largest,a[i]); // we need to calculate the size of the count array
        }
        int count[]=new int[largest+1]; // we apply count sort for positive number so we need to include zero also
         // we add largest+1
        for(int i=0;i<n;i++){
            count[a[i]]=count[a[i]]+1; // we need to increment the count index ech time example 0,1,2,3,4,5,6
        }
        // sorting
        int j=0;
        for(int i=0;i<n;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[a[i]]--;

            }
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array");
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            count(a,n);
        }
    }
}
