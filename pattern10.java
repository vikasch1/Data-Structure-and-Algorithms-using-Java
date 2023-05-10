import java.util.Scanner;
//hollow diamond
//os,is
//2,-1
//1,1
//0,
//1
//2


public class pattern10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int os=n/2;
        int is=-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=os;j++){
                System.out.print("\t");

            }
            System.out.print("*\t");
            for(int j=1;j<=is;j++){
                System.out.print("\t");
            }

            if(i>1 && i<n){
                System.out.print("*\t");
            }
            System.out.println();



            if(i<=n/2){
                os--;
                is=is+2;
            }else{
                os++;
                is=is-2;
            }
        }
    }
}
