import java.util.Scanner;

public class nprfns {
    public static void display(int n , int r,int npr){
        System.out.println(n+ "p" +r+"="+npr);
    }
    public static int fact(int x){
        int rv=1;
        for(int i=1;i<=x;i++){
            rv=rv*i;

        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int r=s.nextInt();

        int nfact=fact(n);
        int nmrfact=fact(n-r);

        int npr=nfact/nmrfact;
//        System.out.print(npr);
        display(n,r,npr);
    }
}
