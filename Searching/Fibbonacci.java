//0 1 1 2 3 5 8 13 21 34 55 89
public class Fibbonacci {
    public static void main(String[] s) {
        int n = 10, a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i=1;i<=n;i++){
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }

    }
}
