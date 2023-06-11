import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairWithBinarySearch {
    //nlogn+nlogn=nlogn
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int tar=s.nextInt();

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int ntar=tar-arr[i];

            if(ntar<arr[i]){
                break;
            }

            int left=i+1;
            int right=arr.length-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(ntar<arr[mid]){
                    right=mid-1;
                }
                else if(ntar>arr[mid]){
                    left=mid+1;
                }
                else{
                    System.out.print(arr[left]+" "+arr[right]);
                    break;
                }
            }
        }
    }
}
