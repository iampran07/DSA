/*Array before sorting:
        12 54 7 90 23
        Array after sorting:
        7 12 23 54 90 */


import java.util.*;
public class BubbleSort {
    public static void main(String[] s){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n=sc.nextInt();
        int A[]=new int[n];

        System.out.println("Enter "+n+" elements in an array: ");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }

        System.out.println("Array before sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }

        System.out.println("\nArray after sorting: ");

        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }

        System.out.println("\nIn descending order: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(A[i]+" ");
        }
    }
}
