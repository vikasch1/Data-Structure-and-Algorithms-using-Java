import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();

        }
        display(arr,0);

    }
    public static void display(int[]arr,int vi){
        if(vi>=arr.length){
            return;
        }




        System.out.println(arr[vi]);
        display(arr,vi+1);
    }
}
