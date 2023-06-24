
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class GetSubSequence {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        ArrayList<String>ans = gss(str);
        System.out.print(ans);



    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        char ch =str.charAt(0);
        String roq=str.substring(1);
        ArrayList<String>rres= gss(roq);


        ArrayList<String>mres= new ArrayList<>();
        for(String ros:rres){
            mres.add(""+ros);
            mres.add(ch+ros);
        }

        return mres;



    }

}
