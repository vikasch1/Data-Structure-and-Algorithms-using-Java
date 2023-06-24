

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class GetMazeWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.print(paths);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr || sc==dc  ){
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }


        ArrayList<String> mres = new ArrayList<>();

        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                mres.add("h" + ms + hpath);

            }
        }

        for (int vms = 1; vms <= dr - sr; vms++) {
            ArrayList<String> vpaths = getMazePaths(sr + vms, sc, dr, dc);
            for (String vpath : vpaths) {
                mres.add("v" + vms + vpath);

            }

        }
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                mres.add("d" + ms + dpath);

            }


        }
        return mres;

    }
}


