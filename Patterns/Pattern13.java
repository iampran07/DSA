/*
A
B C
D E F
*/



import java.util.*;

class Pattern13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int ch=65;
        while(i<=n){
            int j=1;
            while(j<=i){

                System.out.print((char)(ch)+" ");
                ch++;
                j++;
            }
            System.out.println();

            i++;
        }
    }
}