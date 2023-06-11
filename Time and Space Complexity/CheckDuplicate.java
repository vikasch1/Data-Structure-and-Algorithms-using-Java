import java.util.Arrays;
import java.util.Scanner;

public class CheckDuplicate {
    //do it in nlogn-
    //hint -merge sort
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        Arrays.sort(arr);  //nlogn
        int dup=-1;
        for(int i=0;i<=arr.length-2;i++){ //n

            if(arr[i]==arr[i+1]){
                dup=arr[i];

                break;
            }

        }
        System.out.println(dup);
        //tc=nlogn+n=nlogn

    }
}
