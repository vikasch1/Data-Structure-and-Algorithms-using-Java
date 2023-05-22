import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1=s.nextInt();
        int m1=s.nextInt();
        int[][]one= new int[n1][m1];
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j]=s.nextInt();
            }
        }

        int n2=s.nextInt();
        int m2=s.nextInt();

        if(m1!=n2){
            System.out.print("invalid");
            return;
        }

        int[][]two=new int[n2][m2];
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j]=s.nextInt();
            }
        }

        int [][]prd=new int[n1][m2];
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                int val=0;
                for(int k=0;k<m1;k++){   //common dimension -m1
                    val+=one[i][k]*two[k][j];
                }
                prd[i][j]=val;




            }
        }
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                System.out.print(prd[i][j]+"\t");
            }
            System.out.println();

        }

    }
}
