/*
       A A A
       B B B
       C C C
*/



import java.util.*;

class Pattern8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                int ch=65;
                System.out.print((char)(ch+i-1)+" ");

                j++;
            }
            System.out.println();

            i++;
        }
    }
}