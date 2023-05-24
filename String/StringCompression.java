import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss=s.nextLine();
        System.out.println(compression1(ss));
        System.out.println(compression2(ss));
    }

    public static String compression1(String s){
        String ans="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                //do nothing


            }else{
                ans+=s.charAt(i);
            }

        }
        ans+=s.charAt(s.length()-1);



        return ans;
    }
    public static String compression2(String S){
        String ans="";
        int count=1;
        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i)==S.charAt(i+1)){
                count++;

            }else{
                ans+=S.charAt(i);
                if(count>1){
                    ans+=count;

                }
            }
        }
        ans+=S.charAt(S.length()-1);
        if(count>1){
            ans+=count;

        }






        return ans;
    }
}
