import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();

        }
        int data=s.nextInt();
        int idx=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==data){
                idx=i;
                break;
            }



        }
        System.out.println(idx);
    }
}
