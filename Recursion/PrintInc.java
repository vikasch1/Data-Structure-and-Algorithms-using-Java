import java.util.Scanner;

public class PrintInc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        printinc(n);
    }
    public static void printinc(int n){
        if(n==0){
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
}
