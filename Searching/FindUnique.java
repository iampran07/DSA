import java.util.*;
public class FindUnique {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char letters[]=s.toCharArray();


        for(int i=0;i< letters.length;i++){
            for(int j=i+1;j< letters.length;j++){
                if(letters[i]==letters[j]){
                    letters[i]=' ';
                }
            }
        }
        for(int i=0;i<letters.length;i++){
            System.out.print(letters[i]+" ");
        }
    }
}
