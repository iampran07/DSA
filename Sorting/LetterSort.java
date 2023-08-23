import java.util.*;
public class LetterSort
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:(either in small case or in capital) ");
        String s=sc.nextLine();
        System.out.println("Your string before sorting letters is: "+s);

        char letters[]=s.toCharArray();
        for(int i=0;i<letters.length;i++){
            for(int j=i+1;j<letters.length;j++){
                if(letters[i]>letters[j]){
                    char temp=letters[i];
                    letters[i]=letters[j];
                    letters[j]=temp;
                }
            }
        }
        System.out.println("sorting of letters is as follow: ");
        for(int i=0;i<letters.length;i++){
            System.out.print(letters[i]+" ");
        }
    }
}
