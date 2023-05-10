import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int b=s.nextInt();
        int ans=anybtodecimal(n,b);
        System.out.println(ans);


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
//    public static int abtod(int n,int b){
//        int rv=0;
//        int p=1;
//        while(n>0){
//            int r=n%10;
//            n=n/10;
//
//
//            rv=rv+r*p;
//            p=p*10;
//
//        }
//
//
//
//
//        return rv;
//
//    }
}
