
import java.io.*;
        import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int ans = factorial(n);
        System.out.print(ans);
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fact=n*fnm1;
        return fact;
    }

}
