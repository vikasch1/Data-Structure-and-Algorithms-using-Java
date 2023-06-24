
import java.io.*;
        import java.util.*;

public class PowerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int n =s.nextInt();
        int ans =power(x,n);
        System.out.print(ans);
    }

    public static int power(int x, int n){
        if(x==0){
            return 1;
        }

        int pxm1=power(x-1,n);
        int power=pxm1*n;
        return power;

    }

}
