import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int m =s.nextInt();
        ArrayList<String> paths = getmazepaths(1,1,n,m);
        System.out.print(paths);


    }

    public static ArrayList<String> getmazepaths(int sr,int sc, int dr, int dc){
        if(sc==dc && sr==dr){
            ArrayList<String>bres = new ArrayList<>();
            bres.add("");
            return bres;
        }


        ArrayList<String> hpaths = new ArrayList<>();

        ArrayList<String> vpaths = new ArrayList<>();


                if(sc<dc){
                    hpaths= getmazepaths(sr,sc+1,dr,dc);

                }

                if(sr<dr){
                    vpaths=  getmazepaths(sr+1,sc,dr,dc);
                }

        ArrayList<String>paths = new ArrayList<>();
        for(String horpaths:hpaths){
            paths.add("h"+horpaths);
        }
        for(String verpaths:vpaths){
            paths.add("v"+verpaths);
        }
        return paths;







    }
}
