import java.util.Scanner;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.next();

        int []farr= new int[26];
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            int idx=ch-'a';
            farr[idx]++;
        }

        int maxidx=0;
        for(int i=1;i<farr.length;i++){
            if(farr[i]>maxidx){
                maxidx=i;
            }


        }
        char mfc=(char) (maxidx+'a');
        System.out.print(mfc);


    }
}
