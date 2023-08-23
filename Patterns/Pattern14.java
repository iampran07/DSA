/*
D
C D
B C D
A B C D
*/



import java.util.*;

class Pattern14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int ch=68;
        while(i<=n){
            int j=1;
            while(j<=i){

                System.out.print((char)(ch-i+j)+" ");

                j++;
            }
            System.out.println();

            i++;
        }
    }
}