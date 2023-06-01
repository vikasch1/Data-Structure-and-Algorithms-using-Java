import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        printzz(n);

    }
    public static void printzz(int n){

        if(n==0){
            return;
        }

        System.out.print(n);
        printzz(n-1);
        System.out.print(n);
        printzz(n-1);
        System.out.print(n);

    }
}
