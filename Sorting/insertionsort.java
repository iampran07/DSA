import java.util.*;
public class insertionsort {
    static void printarray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

   //IMPORTANT METHOD
    static void insort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(current<arr[j] && j>=0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("\nEnter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("\nArray before sorting: ");
        printarray(arr,n);
        System.out.println("\nArray after sorting: ");
        insort(arr,n);
        printarray(arr,n);
    }
}
