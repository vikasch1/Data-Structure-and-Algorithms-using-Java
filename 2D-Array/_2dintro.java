import java.util.Scanner;

public class _2dintro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int [][]arr= new int[3][4];
//        arr[0][0]=12;
//        arr[0][1]=12;
//        arr[0][2]=12;
//        arr[0][3]=12;
//
//        arr[1][0]=12;
//        arr[1][1]=12;
//        arr[1][2]=12;
//        arr[1][3]=12;
//
//        arr[2][0]=12;
//        arr[2][1]=12;
//        arr[2][2]=12;
//        arr[2][3]=12;
//
//
//        System.out.print(arr[2][3]);

        int r=s.nextInt();
        int c=s.nextInt();
        int [][]arr2= new int[r][c];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                arr2[i][j]=s.nextInt();
            }


        }

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }




    }
}
