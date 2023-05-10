import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int val=1;
        for(int row=1;row<=n;row++){

            for(int col=1;col<=row;col++){
                System.out.print(val+"\t");
                val=val+1;
            }

            System.out.println();



        }






















//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print(row+"\t");
//
//            }
//
//
//            System.out.println();
//
//
//
//        }
    }
}
