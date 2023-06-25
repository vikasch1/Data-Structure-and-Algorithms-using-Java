
import java.io.*;
        import java.util.*;

public class PrintMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int m =s.nextInt();
        printMazePaths(1,1,n,m,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sc==dc && sr==dr){
            System.out.print(psf+" ");
            return;
        }

        for(int ms=1;ms<=dc-sc;ms++){
            printMazePaths(sr,sc+ms,dr,dc,psf+ms+"h");
        }
        for(int ms=1;ms<=dr-sr;ms++){
            printMazePaths(sr+ms,sc,dr,dc,psf+ms+"v");
        }
        for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++){
            printMazePaths(sr+ms,sc+ms,dr,dc,psf+ms+"d");
        }



    }

}
