/*
A B C
B C D
C D E
*/



import java.util.*;

class Pattern11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int ch=65;
        while(i<=n){
            int j=1;
            while(j<=n){

                System.out.print((char)(ch+i+j-2)+" ");

                j++;
            }
            System.out.println();

            i++;
        }
    }
}