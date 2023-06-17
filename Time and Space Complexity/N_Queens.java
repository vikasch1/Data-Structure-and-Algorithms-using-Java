
import java.io.*;
import java.util.*;

public class N_Queens {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int [][]chess= new int[n][n];
        printNQueens(chess,"",0);


    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.println(qsf+".");
            return;

        }
        for(int col=0;col<chess.length;col++){
            if(isitsafeforthequeen(chess,row,col)==true){
                chess[row][col]=1;
                printNQueens(chess,qsf+row+"-"+col+",",row+1);
                chess[row][col]=0;
            }
        }

    }
    public static boolean isitsafeforthequeen(int [][]chess, int r, int c){
        for(int i=r-1,j=c;i>=0;i--){
            if(chess[r][c]>0){
                return false;

            }
        }

        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
            if(chess[r][c]>0){
                return false;

            }
        }
        for(int i=r-1,j=c+1;i>=0 && j<chess.length;i--,j++){
            if(chess[r][c]>0){
                return false;

            }
        }
        return true;

    }
}
