import javax.swing.*;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*\t");
            }



            System.out.println();

        }
















//        Scanner s = new Scanner(System.in);
//        int n =s.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
    }
}
