import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        ArrayList<String>ans=psp(n);
        System.out.println(ans);

    }
    public static ArrayList<String>psp(int n ){
        if(n==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(n<0){
            ArrayList<String>base=new ArrayList<>();
            return base;

        }



        ArrayList<String>pnm1=psp(n-1);
        ArrayList<String>pnm2=psp(n-2);
        ArrayList<String>pnm3=psp(n-3);
        ArrayList<String>paths= new ArrayList<>();
        for(String path1:pnm1){
            paths.add("1"+path1);
        }
        for(String path2:pnm2){
            paths.add("2"+path2);
        }
        for(String path3:pnm3){
            paths.add("3"+path3);
        }

        return paths;

    }
}
