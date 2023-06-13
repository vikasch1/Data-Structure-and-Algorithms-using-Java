import java.util.Scanner;
//13531
public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int nsp=n/2;
        int nst=1;
        for(int row=1;row<=n;row++){
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            for (int i = 1; i <=nst; i++) {
                System.out.print("*\t");

            }

            System.out.println();
            if(row<=n/2){
                nsp=nsp-1;
                nst=nst+2;

            }else{
                nst=nst-2;
                nsp=nsp+1;
            }
        }

















//        int nst=1;
//        int nsp=n/2;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print("\t");
//            }
//            for(int j=1;j<=nst;j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//            if(i<=n/2){
//                nsp=nsp-1;
//                nst=nst+2;
//            } else{
//                nsp=nsp+1;
//                nst=nst-2;
//            }
//        }

    }
}
