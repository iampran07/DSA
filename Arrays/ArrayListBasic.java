import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //add function
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //add at some index
        list.add(1,80);
        list.add(5,90);

        //get element of the list
        int n=list.get(2);
        System.out.println(n);

        //set desired index element
        list.set(2,60);
        list.set(3,100);

        System.out.println(list);
        
        //remove element
        //removing from the start is expensive operation
        list.remove(2);
        list.remove(3);
        System.out.println(list);

        //size of list
        int m=list.size();
        System.out.println(m);
    }
}
