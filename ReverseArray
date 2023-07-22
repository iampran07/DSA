//Reverse of an array without using in-built function
//Write a swap of an array in Java
//Reverse of an array in java


import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int i=0;
        int j=n-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    System.out.println("Reverse of an array is: ");
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
