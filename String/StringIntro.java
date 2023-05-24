import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1="hello";
        String s2= new String("bello");
        System.out.println(s1);
        System.out.println(s2);


        for(int i=0;i<s1.length();i++){
//            char ch=s1[i] //wrong
            char ch=s1.charAt(i);
            System.out.print(ch+"-");
        }

        //s1[0]='p';
        //s1.charAt(0)='p'  not possible


        s1+="world";
        System.out.println(s1);

        System.out.print(10+20+"hello"+10+20);



        String s3=s.next();
        System.out.print(s3);
        String s4=s.nextLine();
        System.out.println(s4);




    }
}
