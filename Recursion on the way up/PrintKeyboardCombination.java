import java.sql.Statement;
import java.util.Scanner;

public class PrintKeyboardCombination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printkpc(str,"");

    }

    static String[]codes={".;","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void printkpc(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        char ch=s.charAt(0);
        String ros=s.substring(1);

        String codeforch=codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++){

            char cho=codeforch.charAt(i);
            printkpc(ros,ans+cho);
        }

    }
}
