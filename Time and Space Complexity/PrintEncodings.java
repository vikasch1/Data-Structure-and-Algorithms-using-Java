import java.io.*;
import java.util.*;

public class PrintEncodings {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        printEncodings(str,"");


    }

    public static void printEncodings(String str,String asf) {
        if(str.length()==0){
            System.out.print(asf+" ");
            return;

        }else if(str.length()==1){
            String ch0=str.substring(0,1);
            if(ch0.equals("0")){
                return;
            }
            int numforch0=Integer.parseInt(ch0);
            String alphabetforch0= (char)('a'+numforch0-1)+"";
            String roq0=str.substring(1);
            printEncodings(roq0,asf+alphabetforch0);




        }else{ //2 0r more length string
            String ch0=str.substring(0,1);
            if(ch0.equals("0")){
                return;
            }
            int numforch0=Integer.parseInt(ch0);
            String alphabetforch0= (char)('a'+numforch0-1)+"";
            String roq0=str.substring(1);
            printEncodings(roq0,asf+alphabetforch0);

            String ch01=str.substring(0,2);
            int numforch01=Integer.parseInt(ch01);
            if(numforch01<=26){
                String alphabetforch01=(char)('a'+numforch01-1)+"";
                String roq01=str.substring(2);
                printEncodings(roq01,asf+alphabetforch01);
            }


        }

    }

}

