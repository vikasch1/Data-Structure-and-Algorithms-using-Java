import java.util.Scanner;

public class WaveDisplay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows=s.nextInt();
        int col=s.nextInt();
        int[][]arr= new int[rows][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }


        }

        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]);
                }

            }else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]);

                }

            }

        }

    }
}
