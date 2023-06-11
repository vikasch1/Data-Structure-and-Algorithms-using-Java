import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplet {
    //tc-n^2
    //tc=nlog+n^2=n^2
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int tar = s.nextInt();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int ntar = tar - arr[i];
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                if(arr[j]+arr[k]>ntar){
                    k--;
                }else if(arr[j]+arr[k]<ntar){
                    j++;
                }else{
                    System.out.println(arr[i]+"-"+arr[j]+"-"+arr[k]);
                    j++;
                    k--;
                }
            }
        }
    }
}


