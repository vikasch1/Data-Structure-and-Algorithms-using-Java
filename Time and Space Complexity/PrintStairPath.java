import java.util.ArrayList;
import java.util.Scanner;
//tc=3^n


public class PrintStairPath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        psp(n,"");

    }
    public static void psp(int n,String asf ){
        if(n<0){
            return;
        } else if (n==0) {
            System.out.print(asf+" ");
            return;

        }

        psp(n-1,asf+"1");
        psp(n-2,asf+"2");
        psp(n-3,asf+"3");


    }
}
