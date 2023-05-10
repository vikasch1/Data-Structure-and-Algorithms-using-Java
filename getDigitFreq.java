public class getdigitfreq {
    public static void main(String[] args) {
        int ans=getdigit(996564,9);
        System.out.print(ans);

    }
    public static int getdigit(int n, int d){
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
