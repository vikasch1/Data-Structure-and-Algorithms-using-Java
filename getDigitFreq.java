import java.util.Scanner;

public class getDigitFreq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int d=s.nextInt();
        int ans=getdigit(n,d);
        System.out.println(ans);
    }
    public static int getdigit(int n,int d){
        int rv=0;
        while(n>0){
            int dig=n%10;
            n=n/10;
            if(dig==d){
                rv++;
            }
        }



        return rv;

    }
}
