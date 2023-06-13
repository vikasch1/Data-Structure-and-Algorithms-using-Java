import java.util.Scanner;

public class intro {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String mystr=s.nextLine();
        String myans=compression1(mystr);
        System.out.print(myans);
//        String myname="vikas";

//        String mystring=new String("vikas");

//        Scanner s = new Scanner(System.in);
//        String naam=s.nextLine();
//        String name2=s.next();
//        System.out.println(name2);
//        int []arr=new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=s.nextInt();
//        }
//        arr[3]=100;
////
//        System.out.print(arr[3]);
//        String str=s.nextLine();
//        System.out.print(str.charAt(3));


//        String ss=s.nextLine();
//        for(int i=0;i<ss.length();i++){
//            char ch=ss.charAt(i);
//            System.out.println(ch);
//        }

//        String firstname="vikas";
//        String lastname="chaudhary";
//        System.out.print(10+20+firstname+1000);

//        String name="vikas";
//        name.charAt(2)='z';

//
//        String name="vikas chaudhary";
////        System.out.print(name.substring(1,5));
////        System.out.print(name.substring(1));
//
//        System.out.print(name.substring(0,10));


//        Scanner ss = new Scanner(System.in);
//        String mystrr=ss.nextLine();
//        for(int i=0;i<mystr.length();i++){
//            for(int j=i+1;j<mystr.length();j++){
//                String sub=mystr.substring(i,j);
//                boolean ans=ispalindrome(sub);
//                if(ans==true){
//                    System.out.println(sub);
//
//                }
//
//            }
//        }













    }
//    public static boolean ispalindrome(String sub){
//        boolean flag=true;
//        int left=0;
//        int right=sub.length()-1;
//        while(left<right){
//            char leftchar=sub.charAt(left);
//            char rightchar=sub.charAt(right);
//            if(leftchar!=rightchar){
//                flag=false;
//            }
//            left++;
//            right--;
//        }
//
//
//
//
//        return flag;
//
//    }


    public static String compression1(String str){
        int count=1;
        String result="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;



            }else{
                result=result+str.charAt(i)+count;

                count=1;

            }
        }
        return result;
    }
}
