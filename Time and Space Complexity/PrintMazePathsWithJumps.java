import java.util.Scanner;

public class PrintMazePathsWithJumps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        printpath(1,1,row,col,"");

    }
    public static void printpath(int sr,int sc,int dr,int dc , String psf){
        if(sr==dr && sc==dc){
            System.out.print(psf+" ");
            return;
        }

        for(int hss=1;hss<=dc-sc;hss++){
            printpath(sr,sc+hss,dr,dc,psf+"H"+hss);


        }

        for(int vss=1;vss<=dr-sr;vss++){
            printpath(sr+vss,sc,dr,dc,psf+"V"+vss);


        }

        for(int dss=1;dss<dc-sc && dss<=dr-sr;dss++){
            printpath(sr+dss,sc+dss,dr,dc,psf+"D"+dss);

        }
    }
}
