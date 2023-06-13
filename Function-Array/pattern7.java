import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==col){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }


            }
            System.out.println();

        }






















//        int nsp=0;
//        for(int row=1;row<=n;row++){
//
//            for(int j=1;j<=nsp;j++){
//                System.out.print("\t");
//            }
//            System.out.print("*\t");
//            System.out.println();
//            nsp=nsp+1;
//
//        }







//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==j){
//                    System.out.print("*\t");
//                }else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
    }
}
