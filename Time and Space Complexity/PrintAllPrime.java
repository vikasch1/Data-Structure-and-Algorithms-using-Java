import java.util.Scanner;

public class PrintAllPrime {
    //o(nrootn)

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int i=2;i<=n;i++){
            boolean isprime=true;
            for(int div=2;div*div<=i;div++){

                if(i%div==0){
                    isprime=false;
                    break;
                }

            }
            if(isprime==true){
                System.out.println(i);
            }



        }




    }
}
