import java.util.ArrayList;
import java.util.Scanner;

public class getjeypadcodes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        ArrayList<String>words= getkpc(str);
        System.out.print(words);
    }
    static String[]codes={".;","abc","def","ghi","jkl","mnop","qrst","uv","wxy","z"};
    public static ArrayList<String> getkpc(String str){
        if(str.length()==0){
            ArrayList<String >baseresult= new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }

        char ch =str.charAt(0);
        String ros=str.substring(1);


        ArrayList<String> rrss=getkpc(ros);
        ArrayList<String> myres= new ArrayList<>();

        String codeforch=codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char chcode=codeforch.charAt(i);
            for(String rstr:rrss){
                myres.add(chcode+rstr);
            }
        }



        return myres;



    }
}
