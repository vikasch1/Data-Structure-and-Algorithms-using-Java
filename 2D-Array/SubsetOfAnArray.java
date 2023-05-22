import java.util.Scanner;

//****
//***

public class SubsetOfAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        int lmt=(1<<n);
        for(int i=0;i<lmt;i++){
            int dec=i;
            String str="";


            for(int j=0;j<arr.length;j++){
                int rem=dec%2;
                dec=dec/2;


                if(rem==0){
                    str="-\t"+str;
                }else{
                    str=(arr[arr.length-1-j])+str;
                }
            }

            System.out.println(str);



        }


    }
}
