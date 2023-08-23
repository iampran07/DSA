/*
        1
        2 2
        3 3 3
        4 4 4 4
*/



import java.util.*;

class Pattern5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int count=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(count+" ");
                j++;
            }
            System.out.println();
            count++;
            i++;
        }
    }
}