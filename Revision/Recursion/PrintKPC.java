
import java.io.*;
        import java.util.*;

public class PrintKPC {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        printKPC(str,"");


    }
    static String[]codes={".;","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf+" ");
            return;
        }

        char ch =str.charAt(0);
        String ros= str.substring(1);
        String codeforch=codes[ch-'0'];

        for(int i=0;i<codeforch.length();i++){
            char cho=codeforch.charAt(i);
            printKPC(ros,asf+cho);
        }

    }

}
