import java.util.Scanner;

public class XpowerN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int n =s.nextInt();
        int ans=xpn(x,n);
        System.out.println(ans);

    }
    public static int xpn(int x,int n){
        if(n==0){
            return 1;
        }

        int xpnm1=xpn(x,n-1);
        int xpn=x*xpnm1;




        return xpn;
    }
}
