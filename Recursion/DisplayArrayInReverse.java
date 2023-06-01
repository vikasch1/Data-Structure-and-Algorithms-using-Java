import java.util.Scanner;

public class DisplayArrayInReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        reverse(arr,0);
    }
    public static void reverse(int[]arr,int idx){
        if(idx==arr.length){
            return;
        }
        reverse(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
