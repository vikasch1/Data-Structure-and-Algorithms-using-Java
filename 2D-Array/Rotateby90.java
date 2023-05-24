import java.util.Scanner;

public class Rotateby90 {
    //square matrix-transpose
    //reverse the col
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int [][]arr= new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();

            }
        }

        //1-transpose

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }





        //2-reverse col

        for(int i=0;i<arr.length;i++){
            int left=0;
            int right=arr[i].length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;

                left++;
                right--;

            }
        }



        //3-dsiplay()
        display(arr);





    }
    public static void display(int[][]myarr){
        for(int i=0;i<myarr.length;i++){
            for(int j=0;j<myarr[0].length;j++){
                System.out.print(myarr[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
