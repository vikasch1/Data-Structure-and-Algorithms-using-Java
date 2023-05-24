import java.util.Scanner;

public class DiagonalDisplay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][]arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }

        }

        for(int g=0;g<arr[0].length;g++){
            for(int i=0,j=g;j<arr[0].length;i++,j++){
                System.out.print(arr[i][j]+" ");

            }


        }
    }
}
