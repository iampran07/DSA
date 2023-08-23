import java.util.*;
public class selsort {

    static void sorting(int arr[],int n){
        int minIndex;
        for(int i=0;i<n-1;i++){
            minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    int temp=arr[j];
                    arr[j]=arr[minIndex];
                    arr[minIndex]=temp;
                }
            }
        }
        System.out.println("Elements after sorting: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements before sorting: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        sorting(arr,n);

    }
}
