import java.util.Scanner;

public class logxpn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int ans =xpn(x,n);
        System.out.println(ans);

    }
    public static int xpn(int x,int n){
        if(n==0){
            return 1;
        }

        int xpnb2=xpn(x,n/2);
        int xn=xpnb2*xpnb2;

        if(n%2==1){
            xn=xn*x;
        }


        return xn;

    }
}
