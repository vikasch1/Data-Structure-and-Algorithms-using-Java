import java.util.Scanner;

public class AnyBaseAddition {
    //236,754
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b =s.nextInt();
        int n1=s.nextInt();
        int n2=s.nextInt();
        int ans=anybaseadd(b,n1,n2);
        System.out.println(ans);


    }
    public static int anybaseadd(int b,int n1,int n2){
        int rv=0;
        int c=0;
        int p=1;
        while (n1>0 || n2>0 ||c>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;

            int d=d1+d2+c;
            c=d/b;
            d=d%b;


            rv=rv+d*p;
            p=p*10;
        }




        return rv;



    }
}
