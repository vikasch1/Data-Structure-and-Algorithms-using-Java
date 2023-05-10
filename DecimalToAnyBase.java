import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int b = s.nextInt();
        int ans=getDigitInBase(n,b);
        System.out.println(ans);
    }
    public static int getDigitInBase(int n, int b){
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%b;
            n=n/b;


            rv=rv+dig*p;
            p=p*10;

        }




        return rv;

    }
}
