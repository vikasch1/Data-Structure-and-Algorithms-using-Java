import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int ans =fact(n);
        System.out.print(ans);
    }

    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact=1;
        fact=n*fact(n-1);


        return fact;
    }
}
