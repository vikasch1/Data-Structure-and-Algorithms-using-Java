import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJumps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int m =s.nextInt();
        ArrayList<String>paths = getmazepathwithjumps(1,1,n,m);
        System.out.print(paths);


    }
    public static ArrayList<String> getmazepathwithjumps(int sr,int sc,int dr,int dc){
        if(sc==dc && sr==dr){
            ArrayList<String>bres= new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String>paths = new ArrayList<>();
        for(int ms=1;ms<=dc-sc;ms++){

            ArrayList<String>hpaths = getmazepathwithjumps(sr,sc+ms,dr,dc);
            for(String horpaths:hpaths){
                paths.add("h"+ms+horpaths);
            }



        }

        for(int ms=1;ms<=dr-sr;ms++){

            ArrayList<String>vpaths = getmazepathwithjumps(sr+ms,sc,dr,dc);
            for(String verpaths:vpaths){
                paths.add("v"+ms+verpaths);
            }




        }

        for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++){

            ArrayList<String>dpaths = getmazepathwithjumps(sc+ms,sc+ms,dr,dc);
            for(String digpaths:dpaths){
                paths.add("d"+ms+digpaths);
            }







        }
        return paths;
    }
}
