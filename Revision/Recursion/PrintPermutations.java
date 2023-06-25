
import java.io.*;
        import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        printPermutations(str,"");

    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.print(asf+" ");
            return;
        }

for(int i=0;i<str.length();i++){
    char ch =str.charAt(i);
    String left=str.substring(0,i);
    String right=str.substring(i+1);
    String roq=left+right;
    printPermutations(roq,asf+ch);


}


    }

}
