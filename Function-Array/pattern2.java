import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int nst=n;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=nst;col++){
                System.out.print("*\t");
            }
            System.out.println();
            nst=nst-1;
        }










//        int nst=n;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nst;j++){
//                System.out.print("*\t");
//            }
//            nst=nst-1;
//            System.out.println();
//
//            //for(int i=n;i>=1;i--){
//            // for j=1;j<=i;j++
//        }
    }
}
