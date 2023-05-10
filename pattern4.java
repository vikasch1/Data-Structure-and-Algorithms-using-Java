import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int nsp=0;
        int nst=n;
        for(int row=1;row<=n;row++){
           for(int j=1;j<=nsp;j++){
               System.out.print("\t");
           }
           for(int j=1;j<=nst;j++){
               System.out.print("*\t");
           }
            System.out.println();
            nsp=nsp+1;
            nst=nst-1;


        }




























//        int nsp=0;
//        int nst=n;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print("\t");
//
//            }
//
//            for(int j=1;j<=nst;j++){
//                System.out.print("*\t");
//
//            }
//            System.out.println();
//            nsp=nsp+1;
//            nst=nst-1;
//
//        }
    }
}
