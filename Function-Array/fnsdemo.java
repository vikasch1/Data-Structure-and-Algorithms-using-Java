import java.util.Scanner;

public class fnsdemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
//        int d=s.nextInt();
//        int ans=countdigit(n,d);
//        System.out.print(ans);
//        reverseprint(n);
//        reverseprint(n);
        pattern(n);


    }
  public static int countdigit(int n,int d){
        int count=0;
        while(n>0){
            int ld=n%10;
            n=n/10;
            if(ld==d){
                count=count+1;
            }
        }




        return count;
  }
  public static void reverseprint(int n){
        while(n>0){
            int ld=n%10;
            System.out.println(ld);
            n=n/10;
        }
  }

  public static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if( col==1 || col==n || row==col || row+col==n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
  }
}
