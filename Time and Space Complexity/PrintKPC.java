import java.util.Scanner;
//n power n

public class PrintKPC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         String str=s.nextLine();
         pkpc(str,"");

    }
    static String[]codes={".;","abc","def","ghi","jkl","pqrs","tu","mno","vw","xyz"};
    public static void pkpc(String str,String asf){
        if(str.length()==0){
            System.out.print(asf+" ");
            return;
        }

        char ch =str.charAt(0);
        String ros=str.substring(1);

        String code=codes[ch-48];
        for(int i=0;i<code.length();i++){
            char codeat=code.charAt(i);
            pkpc(ros,asf+codeat);
        }


    }
}
