/*
123
123
123
 */



import java.util.*;

class Pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}