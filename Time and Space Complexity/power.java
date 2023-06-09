import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int x=s.nextInt();
        int p1ans=power1(x,n);
        System.out.print("power 1 "+p1ans);
        int p2ans=power1(x,n);
        System.out.print("power 2 "+p2ans);
        int p3ans=power1(x,n);
        System.out.print("power 3 "+p3ans);


    }
    public static int power1(int x,int n){
        if(n==0){
            return 1;

        }


        int xpnm1=power1(x,n-1);
        int xpn=xpnm1*x;

        return xpn;
        //t(n)=t(n-1)+k
        //t(n) is proportional to n.



    }
    public static int power2(int x, int n){
        if(n==0){
            return 1;
        }

        int xpnb2=power2(x,n/2);
        int xpn=xpnb2*xpnb2;
        if(n%2==1){
            xpn=xpn*x;
        }

        return xpn;

        //t(n)=t(n/2)+k
        //t(n) is proportional to log n.

    }

    public static int power3(int x,int n){
        if(n==0){
            return 1;
        }

        if(n%2==0){
            return power3(x,n/2)*power3(x,n/2);
        }else{
            return power3(x,n/2)*power3(x,n/2)*x;

        }

        //t(n)=t(n/2)+t(n/2)+k
        //k+2k+2^2k+......2^x-1k
        //sum of gp=a(r^n-1)/r-1




    }
}
