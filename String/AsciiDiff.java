import java.util.Scanner;

public class AsciiDiff {
    //abdgca-a1b2d3g4c2a
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(Ascidiff(str));

    }
    public static String Ascidiff(String str){
        StringBuilder sb = new StringBuilder();
       sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char current=str.charAt(i);
            char prev=str.charAt(i-1);
            int gap=current-prev;

            sb.append(gap);
            sb.append(current);


        }
        return sb.toString();
    }
}
