import java.util.Scanner;

public class Fibonacii {
    //o(2^n)

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        System.out.println(fib(n));

    }
    public static int fib(int n ){
        if(n==0 || n==1){
            return n;
        }

        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
        int finalfib=fibnm1+fibnm2;


        return finalfib;
    }
}
