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
//
//        int n =s.nextInt();
//        int []arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=s.nextInt();
//        }
//        int data=s.nextInt();
//        int left=0;
//        int right=arr.length-1;
//        int fountat=0;
//        while(left<=right){
//            int mid=(left+right)/2;
//            if(arr[mid]>data){
//                right=mid-1;
//
//            }else if(arr[mid]<data){
//                left=mid+1;
//
//
//            }else{
//                System.out.print("data found at"+mid);
//            }
//        }
//
//        while()

    }
}
