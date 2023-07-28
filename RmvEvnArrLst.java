//Write an algorithm to remove even number from array or arraylist.

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //adding elements in the list
        list.add(3);
        list.add(4);
        list.add(67);
        list.add(88);
        list.add(12);
        list.add(9);
        list.add(70);

        System.out.println(list);
        removeven(list);
    }

    public static void removeven(ArrayList<Integer>list){
        //iterating from last to first
        for(int i=list.size()-1;i>=0;i--)
        {
            if(list.get(i)% 2==0)
            {
                list.remove(i);
            }
        }
        System.out.println("After removing of even numbers from list:\n"+list);
    }
}
