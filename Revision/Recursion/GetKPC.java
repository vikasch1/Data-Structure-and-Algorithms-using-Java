
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class GetKPC {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        ArrayList<String>words = getKPC(str);
        System.out.print(words);

    }
    static String[]codes={".;","abc","def","ghi","jkl","mn0","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch =str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>rres=getKPC(ros);
        ArrayList<String>mres = new ArrayList<>();
        String codefroch=codes[ch-'0'];
        for(int i=0;i<codefroch.length();i++){
            char chcode=codefroch.charAt(i);
            for(String rstr:rres){
                mres.add(chcode+rstr);

            }
        }
        return mres;
    }

}

