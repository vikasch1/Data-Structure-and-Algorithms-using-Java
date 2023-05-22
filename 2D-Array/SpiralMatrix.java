import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int m=s.nextInt();
        int[][]arr= new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int total=m*n;
        int count=1;


        while(count<=total){
            //1=left wall-downwards
            for(int r=minr;r<=maxr && count<=total;r++){
                System.out.print(arr[r][minc]+"\t");
                count++;
            }
            minc++;



            //2-bottom wall-right wards
            for(int j=minc;j<=maxc && count<=total;j++){
                System.out.print(arr[maxr][j]+"\t");
                count++;
            }
            maxr--;




            //3-right wall-upwards
            for(int r=maxr;r>=minr && count<=total;r--){
                System.out.print(arr[r][maxc]+"\t");
                count++;
            }
            maxc--;




            //4-top-left wards
            for(int j=maxc;j>=minc && count<=total;j--){
                System.out.print(arr[minr][j]+"\t");
                count++;
            }
            minr++;

        }

    }
}
