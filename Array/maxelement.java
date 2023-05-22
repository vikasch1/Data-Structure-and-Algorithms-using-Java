package Array;

import java.util.Scanner;

public class maxelement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []myarray= new int[n];
        for(int i=0;i<myarray.length;i++){
            myarray[i]=s.nextInt();
        }
        int ans1=max(myarray);

        int ans2=min(myarray);
        int span=ans1-ans2;
        System.out.println(span);


    }
    public static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int[]arrr){
        int min=arrr[0];
        for(int i=1;i<arrr.length;i++){
            if(arrr[i]<min){
                min=arrr[i];
            }
        }
        return min;
    }
}
