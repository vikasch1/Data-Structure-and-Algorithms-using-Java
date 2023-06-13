import java.util.Scanner;
//hollow diamond
//3* 1sp 3
//2 3sp 2
//1* 5sp 1
//2* 3sp 2
//3* 1sp 3
public class pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int nst=n/2 +1;
        int nsp=1;
        for(int row=1;row<=n;row++){
            //magic-star space star
            for(int i=1;i<=nst;i++){
                System.out.print("*\t");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(row<=n/2){
                nst=nst-1;
                nsp=nsp+2;
            }else{
                nst=nst+1;
                nsp=nsp-2;
            }
        }
















//        int nst=n/2 +1;
//        int nsp=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nst;j++){
//                System.out.print("*\t");
//            }
//            for(int j=1;j<=nsp;j++){
//                System.out.print("\t");
//            }
//            for(int j=1;j<=nst;j++){
//                System.out.print("*\t");
//            }
//
//            System.out.println();
//            if(i<=n/2){
//                nst=nst-1;
//                nsp=nsp+2;
//            } else{
//                nst=nst+1;
//                nsp=nsp-2;
//            }
//        }
    }
}
