import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int b1=s.nextInt();
        int b2=s.nextInt();
        int ans=getvalue(n,b1,b2);
        System.out.println(ans);

    }
    public static int getvalue(int n,int b1,int b2){
        int dec=anybtodecimal(n,b1);
        int finalans=getDigitInBase(dec,b2);


        return finalans;

    }
    public static int anybtodecimal(int n,int b){
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%10;
            n=n/10;

            rv=rv+dig*p;
            p=p*b;

        }



        return rv;

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
