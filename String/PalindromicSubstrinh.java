import java.util.Scanner;

public class PalindromicSubstrinh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss=s.nextLine();
        solution(ss);


    }
    public static void solution(String mystr){
        for(int i=0;i<mystr.length();i++){
            for(int j=i+1;j<=mystr.length();j++){
                String sub=mystr.substring(i,j);
                boolean ispalindrome=ispalindrome(sub);
                if(ispalindrome==true){
                    System.out.println(sub);

                }

            }
        }


    }
    public static boolean ispalindrome(String sub){
        boolean flag=true;
        int left=0;
        int right=sub.length()-1;
        while(left<right){
            char chleft=sub.charAt(left);
            char chright=sub.charAt(right);
            if(chleft!=chright){
                flag=false;
                break;
            }

            left++;
            right--;

        }

        return flag;
    }
}
