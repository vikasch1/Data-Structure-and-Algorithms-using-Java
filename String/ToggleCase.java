import java.util.Scanner;
import java.util.stream.StreamSupport;

public class ToggleCase {

    //uc="A"+LC-"a"
    //lc="a"+uc-"A"
    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        System.out.print(togglecase(str));
    }
    public static String togglecase(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch>='a' && ch<='z'){
                char uch=(char) ('A'+ch-'a');
                sb.setCharAt(i,uch);

            }else{
                char lch=(char) ('a'+ch-'A');
                sb.setCharAt(i,lch);

            }

        }
        return sb.toString();
    }





}
