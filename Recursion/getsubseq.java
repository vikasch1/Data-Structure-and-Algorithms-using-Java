import java.util.ArrayList;
import java.util.Scanner;

public class getsubseq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        ArrayList<String> ans =getss(str);
        System.out.print(ans);

    }
    public static ArrayList<String> getss(String s){
        if(s.length()==0){
            ArrayList<String>baseresult=new ArrayList<>();
            baseresult.add("");
            return baseresult;

        }

        char ch =s.charAt(0);
        String ros=s.substring(1);

        ArrayList<String> rfrs=getss(ros);


        ArrayList<String>myres=new ArrayList<>();
        for(String rstr:rfrs){
            myres.add(""+rstr);
            myres.add(ch+rstr);




        }
        return myres;
    }
}
