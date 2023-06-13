import java.util.Scanner;

public class patternfns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
//        pattern1(n);
//        patter2(n);
        pattern3(n);
    }

    public static void pattern1(int n ){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();

        }
    }
    public static void patter2(int n){
        int nstr=1;
        for(int row=1;row<=2*n-1;row++){
            for(int col=1;col<=nstr;col++){
                System.out.print("*\t");
            }
            System.out.println();
            if(row<n){
                nstr++;
            }else{
                nstr--;
            }
        }
    }

    public static void pattern3(int n){
        for(int row=0;row<2 * n;row++){
            int totalcolinrow=row>n?2 * n - row: row;
            int totalnospaces=n-totalcolinrow;
            for(int s=0;s<totalnospaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalcolinrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    }


