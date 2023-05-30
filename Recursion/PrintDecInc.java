import java.util.Scanner;

public class PrintDecInc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        printdecinc(n);

    }
    public static void printdecinc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printdecinc(n-1);
        System.out.println(n);

    }
}
