import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        printdec(n);

    }
    public static void printdec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printdec(n-1);
    }

}
