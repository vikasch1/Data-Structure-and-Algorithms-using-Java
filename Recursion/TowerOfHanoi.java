import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int t1id=s.nextInt();
        int t2id=s.nextInt();
        int t3id=s.nextInt();
        toh(n,t1id,t2id,t3id);



    }
    public static void toh(int n,int t1,int t2,int t3){
        if(n==0){
            return;
        }

        toh(n-1,t1,t3,t2);
         System.out.println(n+"["+t1+"->"+t2+"]");
         toh(n-1,t3,t2,t1);
    }
}
