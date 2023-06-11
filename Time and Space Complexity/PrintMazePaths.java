import java.io.*;
import java.util.*;

public class PrintMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        printMazePaths(1,1,row,col,"");


    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sc>dc || sr>dr){
            return;
        }else if(sc==dc && sr==dr){
            System.out.print(psf+" ");
            return;
        }

        printMazePaths(sr,sc+1,dr,dc,psf+"H");
        printMazePaths(sr+1,sc,dr,dc,psf+"V");


    }

}