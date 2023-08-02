//This program illustrate the sum of even number from 0 to N.
//I have used basic formula which efficiently calculates the sum.

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
      int sum=((n/2)*(n/2))+(n/2);

      System.out.println(sum);
    }
}
