import java.util.ArrayList;
import java.util.Scanner;

public class getstairpath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        ArrayList<String>ans= getsp(n);
        System.out.print(ans);


    }
    public static ArrayList<String> getsp(int n){
        if(n==0){
            ArrayList<String>baseresult= new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }
        else if(n<0){
            ArrayList<String>baseresult= new ArrayList<>();

            return baseresult;

        }


        ArrayList<String >pathone=getsp(n-1);
        ArrayList<String >pathtwo=getsp(n-2);
        ArrayList<String >paththree=getsp(n-3);

        ArrayList<String>paths= new ArrayList<>();
        for(String path:pathone){
            paths.add(1+path);
        }
        for(String path:pathtwo){
            paths.add(2+path);
        }
        for(String path:paththree){
            paths.add(3+path);
        }

        return paths;
    }
}
