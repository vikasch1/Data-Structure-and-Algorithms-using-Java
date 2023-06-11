//public class GetMazePaths {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//    }
//}


import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        ArrayList<String>ans = getMazePaths(1,1,row,col);
        System.out.print(ans+" ");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String>base= new ArrayList<>();
            base.add("");
            return base;
        }else if(sr>dr || sc>dc){
            ArrayList<String>base= new ArrayList<>();
            return base;
        }



        ArrayList<String> hpaths=getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> vpaths=getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String>paths=new ArrayList<>();
        for(String pathh:hpaths){
            paths.add("H"+pathh);
        }

        for(String pathv:vpaths){
            paths.add("V"+pathv);
        }

        return paths;





    }

}