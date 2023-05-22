import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        int data=s.nextInt();
        int low=0;
        int high=arr.length-1;
        int foundat=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(data>arr[mid]){
                low=mid+1;

            }else if(data<arr[mid]){
                high=mid-1;

            }else{
                foundat=mid;
                break;

            }

        }
        System.out.print(foundat);

    }
}
