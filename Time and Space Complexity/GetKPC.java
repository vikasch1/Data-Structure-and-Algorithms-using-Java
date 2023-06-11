import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
       String str =s.next();
       ArrayList<String>ans= gkpc(str);
       System.out.print(ans+" ");
    }
    static String[]codes={".;","abc","def","ghi","jkl","pqrs","tu","mno","vw","xyz"};
    public static ArrayList<String>gkpc(String str){
        if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch =str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>rros=gkpc(ros);
        ArrayList<String>mres=new ArrayList<>();
        String code=codes[ch-48];
        for(int i=0;i<code.length();i++){
            char codeat=code.charAt(i);
            for(String res:rros){
                mres.add(codeat+res);
            }

        }


return mres;

    }
}
