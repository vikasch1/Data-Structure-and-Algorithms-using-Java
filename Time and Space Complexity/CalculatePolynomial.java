import java.util.Scanner;

public class CalculatePolynomial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int ans =poly(x,n);
        System.out.println(ans);

    }
    public static int poly(int x,int n){
        int c=n;
        int pox=x;
        int ans=0;

        while(c>=1){
            int term=c*pox;
            ans+=term;
            c--;
            pox=pox*x;






        }
        return ans;
    }
}
