
import java.io.*;
        import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        ArrayList<String>paths = getStairPaths(n);
        System.out.print(paths);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }else if(n<0){
            ArrayList<String>base = new ArrayList<>();
            return base;
        }



        ArrayList<String>pathsfrom1=getStairPaths(n-1);
        ArrayList<String>pathsfrom2=getStairPaths(n-2);
        ArrayList<String>pathsfrom3=getStairPaths(n-3);


        ArrayList<String>totalpaths= new ArrayList<>();
        for(String path1:pathsfrom1){
            totalpaths.add("1"+path1);
        }
        for(String path2:pathsfrom2){
            totalpaths.add("2"+path2);
        }
        for(String path3:pathsfrom3){
            totalpaths.add("3"+path3);
        }

        return totalpaths;

    }

}
