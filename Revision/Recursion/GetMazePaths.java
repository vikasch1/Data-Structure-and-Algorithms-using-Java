
import java.io.*;
        import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int m =s.nextInt();


        ArrayList<String>paths =getMazePaths(1,1,n,m);
        System.out.print(paths);


    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }


        ArrayList<String>hpaths= new ArrayList<>();
        ArrayList<String>vpaths = new ArrayList<>();
                if(sr<dr){
                    vpaths=getMazePaths(sr+1,sc,dr,dc);
                }
                if(sc<dc){
                    hpaths=getMazePaths(sr,sc+1,dr,dc);
                }

        ArrayList<String>totalpaths = new ArrayList<>();

        for(String hp:hpaths){
            totalpaths.add("h"+hp);

        }
        for(String vp:vpaths){
            totalpaths.add("v"+vp);
        }

        return totalpaths;
    }

}
