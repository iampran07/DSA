/*
1 2 3
4 5 6
7 8 9
 */



import java.util.*;

class Patter3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,count=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(count+" ");
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}